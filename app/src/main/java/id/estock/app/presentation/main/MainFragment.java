package id.estock.app.presentation.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import id.estock.app.R;
import id.estock.app.databinding.MainFragmentBinding;
import id.estock.app.utils.base.BaseFragment;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class MainFragment extends BaseFragment<MainFragmentBinding, MainViewModel> implements MainUserActionListener {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public int getLayoutRes() {
        return R.layout.main_fragment;
    }

    @Override
    public Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

}
