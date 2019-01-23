package id.estock.app.presentation.detailproduct;


import android.support.v4.app.Fragment;
import android.view.View;

import id.estock.app.R;
import id.estock.app.databinding.FragmentDetailProductBinding;
import id.estock.app.utils.base.BaseFragment;

import static id.estock.app.utils.Statics.KEY_ID_DATA;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailProductFragment extends BaseFragment<FragmentDetailProductBinding, DetailProductViewModel> {


    public static DetailProductFragment newInstance() {
        return new DetailProductFragment();
    }


    @Override
    public void onCreateBinding(FragmentDetailProductBinding binding) {
        binding.toolbarDetailProduct.setNavigationOnClickListener(v -> {
            requireActivity().onBackPressed();
        });
        if (requireActivity().getIntent() != null) {
            mViewModel.bId.set(requireActivity().getIntent().getStringExtra(KEY_ID_DATA));
        }
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_detail_product;
    }

    @Override
    public Class<DetailProductViewModel> getViewModelClass() {
        return DetailProductViewModel.class;
    }

}
