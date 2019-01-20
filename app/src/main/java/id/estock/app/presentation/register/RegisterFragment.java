package id.estock.app.presentation.register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.estock.app.R;
import id.estock.app.databinding.FragmentRegisterBinding;
import id.estock.app.utils.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends BaseFragment<FragmentRegisterBinding, RegisterViewModel> {


    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }


    @Override
    public void onCreateBinding(FragmentRegisterBinding binding) {

    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_register;
    }

    @Override
    public Class<RegisterViewModel> getViewModelClass() {
        return RegisterViewModel.class;
    }

}
