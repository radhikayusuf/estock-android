package id.estock.app.presentation.splash;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.estock.app.R;
import id.estock.app.databinding.FragmentSplashBinding;
import id.estock.app.utils.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends BaseFragment<FragmentSplashBinding, SplashViewModel> {


    public static SplashFragment newInstance() {
        return new SplashFragment();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_splash;
    }

    @Override
    public Class<SplashViewModel> getViewModelClass() {
        return SplashViewModel.class;
    }

}
