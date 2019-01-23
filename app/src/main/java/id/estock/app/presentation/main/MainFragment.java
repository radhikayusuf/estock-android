package id.estock.app.presentation.main;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import id.estock.app.R;
import id.estock.app.databinding.MainFragmentBinding;
import id.estock.app.presentation.scanner.ScannerQrActivity;
import id.estock.app.presentation.search.SearchActivity;
import id.estock.app.utils.base.BaseFragment;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class MainFragment extends BaseFragment<MainFragmentBinding, MainViewModel> implements MainUserActionListener, BottomNavigationView.OnNavigationItemSelectedListener, Toolbar.OnMenuItemClickListener {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreateBinding(MainFragmentBinding binding) {
        binding.bottomMain.setOnNavigationItemSelectedListener(this);
        hideAndShowFragment(getFragmentManager().findFragmentById(R.id.fragmentHome));
        binding.toolbarMain.inflateMenu(R.menu.main_menu_search);
        binding.toolbarMain.setOnMenuItemClickListener(this);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.main_fragment;
    }

    @Override
    public Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.main_home:
                hideAndShowFragment(getFragmentManager().findFragmentById(R.id.fragmentHome));
                break;
            case R.id.main_maps:
                break;
            case R.id.main_profile:
                hideAndShowFragment(getFragmentManager().findFragmentById(R.id.fragmentProfile));
                break;
        }
        return true;
    }

    private void hideAndShowFragment(Fragment fragment){
        if (getFragmentManager() != null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            if (getFragmentManager().findFragmentById(R.id.fragmentHome) != null) {
                transaction.hide(getFragmentManager().findFragmentById(R.id.fragmentHome));
            }

            if(getFragmentManager().findFragmentById(R.id.fragmentProfile) != null){
                transaction.hide(getFragmentManager().findFragmentById(R.id.fragmentProfile));
            }
            transaction.show(fragment);
            transaction.commit();
        }


    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.main_search:
                SearchActivity.startThisActivity(requireContext());
                break;
            case R.id.scanQR:
                ScannerQrActivity.startThisActivity(requireContext());
                break;
        }
        return false;
    }
}
