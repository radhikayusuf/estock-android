package id.estock.app.utils.base;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.estock.app.BR;
import id.estock.app.presentation.main.MainViewModel;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public abstract class BaseFragment<B extends ViewDataBinding, T extends BaseViewModel> extends Fragment {

    protected B mViewBinding;
    protected T mViewModel;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewBinding = DataBindingUtil.inflate(LayoutInflater.from(requireContext()), getLayoutRes(), null, false);
        mViewModel = ViewModelProviders.of(this).get(getViewModelClass());
        mViewBinding.setVariable(BR.mViewModel, mViewModel);
        return mViewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel.mShowMessage.observe(this, text -> {
            if (text != null) {
                Snackbar.make(mViewBinding.getRoot(), text, Snackbar.LENGTH_SHORT).show();
            }
        });

        mViewModel.mShowMessageRes.observe(this, textRes -> {
            if (textRes != null) {
                Snackbar.make(mViewBinding.getRoot(), textRes, Snackbar.LENGTH_SHORT).show();
            }
        });

        onCreateBinding(mViewBinding);
    }

    public abstract void onCreateBinding(B binding);
    public abstract int getLayoutRes();
    public abstract Class<T> getViewModelClass();
}
