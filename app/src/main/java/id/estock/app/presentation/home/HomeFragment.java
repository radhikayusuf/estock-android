package id.estock.app.presentation.home;

import android.support.v7.widget.GridLayoutManager;

import id.estock.app.R;
import id.estock.app.databinding.FragmentHomeBinding;
import id.estock.app.utils.base.BaseFragment;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> {

    @Override
    public void onCreateBinding(FragmentHomeBinding binding) {
        binding.recyclerHome.setAdapter(new HomeAdapter(mViewModel.mHomeModel.get(), getChildFragmentManager()));
        GridLayoutManager layoutManager = new GridLayoutManager(requireContext(), 2);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                return i == 0 ? 2 : 1;
            }
        });
        binding.recyclerHome.setLayoutManager(layoutManager);
        if (binding.recyclerHome.getAdapter() != null) {
            binding.recyclerHome.getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public Class<HomeViewModel> getViewModelClass() {
        return HomeViewModel.class;
    }
}
