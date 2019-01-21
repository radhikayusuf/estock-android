package id.estock.app.presentation.profile;


import android.support.v4.app.Fragment;

import id.estock.app.R;
import id.estock.app.presentation.login.LoginActivity;
import id.estock.app.presentation.register.RegisterActivity;
import id.estock.app.utils.base.BaseFragment;import id.estock.app.databinding.FragmentProfileBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends BaseFragment<FragmentProfileBinding, ProfileViewModel> implements ProfileUserActionListener {


    public static ProfileFragment newInstance(){
        return new ProfileFragment();
    }

    @Override
    public void onCreateBinding(FragmentProfileBinding binding) {
        binding.setMListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_profile;
    }

    @Override
    public Class<ProfileViewModel> getViewModelClass() {
        return ProfileViewModel.class;
    }

    @Override
    public void onClickSignIn() {
        LoginActivity.startThisActivity(requireContext());
    }

    @Override
    public void onClickRegister() {
        RegisterActivity.startThisActivity(requireContext());
    }

    @Override
    public void onClickSignOut() {

    }

    @Override
    public void onClickPrivacyPolicy() {

    }

    @Override
    public void onClickProfile() {

    }
}
