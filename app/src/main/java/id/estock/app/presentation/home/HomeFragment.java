package id.estock.app.presentation.home;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import id.estock.app.R;
import id.estock.app.databinding.FragmentHomeBinding;
import id.estock.app.presentation.detailproduct.DetailProductActivity;
import id.estock.app.utils.base.BaseFragment;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> implements HomeUserActionListener {

    @Override
    public void onCreateBinding(FragmentHomeBinding binding) {

        binding.pagerHome.setAdapter(new HomePagerAdapter(getChildFragmentManager(), mViewModel.mHomeModel.get().getCaraouselModels()));
        binding.pagerHome.setOffscreenPageLimit(mViewModel.mHomeModel.get().getCaraouselModels().size());
        if (binding.pagerHome.getAdapter() != null) {
            binding.pagerHome.getAdapter().notifyDataSetChanged();
        }

        final HomeAdapter adapter =  new HomeAdapter(mViewModel.mHomeModel.get(), this);
        LinearLayoutManager layoutManager = new GridLayoutManager(requireContext(), 2);
        binding.recyclerHome.setLayoutManager(layoutManager);
        binding.recyclerHome.setAdapter(adapter);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public Class<HomeViewModel> getViewModelClass() {
        return HomeViewModel.class;
    }

    @Override
    public void onClickItemContent(HomeModel.HomeContentItemModel data) {
        DetailProductActivity.startThisActivity(requireContext(), String.valueOf(data.getId()));
    }
}
