package id.estock.app.presentation.login;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import id.estock.app.R;
import id.estock.app.databinding.FragmentLoginBinding;
import id.estock.app.utils.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment<FragmentLoginBinding, LoginViewModel> {


    public static LoginFragment newInstance() {
        return new LoginFragment();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_login;
    }

    @Override
    public Class<LoginViewModel> getViewModelClass() {
        return LoginViewModel.class;
    }

}
