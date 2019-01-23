package id.estock.app.presentation.scanner;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

public class ScannerQrActivity extends BaseActivity<ScannerQrFragment> {


    @Override
    public int getLayoutRes() {
        return R.layout.activity_scanner_qr;
    }

    @Override
    public ScannerQrFragment onCreateFragment() {
        return ScannerQrFragment.newInstance();
    }

    @Override
    public void onViewReady() {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mFragment.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public static void startThisActivity(Context context){
        Intent i = new Intent(context, ScannerQrActivity.class);
        context.startActivity(i);
    }
}
