package id.estock.app.presentation.scanner;


import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.BeepManager;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DefaultDecoderFactory;

import java.util.ArrayList;
import java.util.List;

import id.estock.app.R;
import id.estock.app.databinding.FragmentScannerQrBinding;
import id.estock.app.presentation.detailproduct.DetailProductActivity;
import id.estock.app.utils.CameraGalleryHelper;
import id.estock.app.utils.base.BaseFragment;


public class ScannerQrFragment extends BaseFragment<FragmentScannerQrBinding, ScannerViewModel> implements BarcodeCallback {

    private BeepManager mBeepManager;

    public static ScannerQrFragment newInstance() {
        return new ScannerQrFragment();
    }


    @Override
    public void onCreateBinding(FragmentScannerQrBinding binding) {
        CameraGalleryHelper.checkCameraPermission(requireActivity());
        initQrScanner();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CameraGalleryHelper.REQUEST_CAMERA_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                    ContextCompat.checkSelfPermission(requireContext(), android.Manifest.permission.CAMERA)
                            == PackageManager.PERMISSION_DENIED) {
                Toast.makeText(requireContext(), "Please allow camera permission", Toast.LENGTH_SHORT).show();
                requireActivity().finish();
            }
        }
    }

    private void initQrScanner() {
        List<BarcodeFormat> mFormatList = new ArrayList<>();
        mFormatList.add(BarcodeFormat.QR_CODE);
        mFormatList.add(BarcodeFormat.CODE_39);
        mViewBinding.zxingBarcodeScanner.getBarcodeView().setDecoderFactory(new DefaultDecoderFactory(mFormatList));
        mViewBinding.zxingBarcodeScanner.decodeContinuous(this);
        mViewBinding.zxingBarcodeScanner.resume();
        mBeepManager = new BeepManager(requireActivity());
        mBeepManager.setBeepEnabled(true);
        mBeepManager.setVibrateEnabled(true);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_scanner_qr;
    }

    @Override
    public void onResume() {
        super.onResume();
        mViewBinding.zxingBarcodeScanner.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mViewBinding.zxingBarcodeScanner.pause();
    }

    @Override
    public Class<ScannerViewModel> getViewModelClass() {
        return ScannerViewModel.class;
    }

    @Override
    public void barcodeResult(BarcodeResult result) {
        mBeepManager.playBeepSoundAndVibrate();
        mViewBinding.zxingBarcodeScanner.pause();
        DetailProductActivity.startThisActivity(requireContext(), result.getText());
    }

    @Override
    public void possibleResultPoints(List<ResultPoint> resultPoints) {

    }
}
