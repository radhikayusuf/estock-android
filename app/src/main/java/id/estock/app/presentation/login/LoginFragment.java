package id.estock.app.presentation.login;


import android.support.v4.app.Fragment;

import id.estock.app.R;
import id.estock.app.databinding.FragmentLoginBinding;
import id.estock.app.presentation.main.MainActivity;
import id.estock.app.utils.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment<FragmentLoginBinding, LoginViewModel> implements LoginUserActionListener{


    public static LoginFragment newInstance() {
        return new LoginFragment();
    }


    @Override
    public void onCreateBinding(FragmentLoginBinding binding) {
        binding.setMListener(this);
        mViewModel.bMovePage.observe(this, success -> {
            if (success) {
                MainActivity.startThisActivity(getContext());
            }
        });
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_login;
    }

    @Override
    public Class<LoginViewModel> getViewModelClass() {
        return LoginViewModel.class;
    }


    @Override
    public void onClickLogin() {
        mViewModel.doLogin();
    }
}
