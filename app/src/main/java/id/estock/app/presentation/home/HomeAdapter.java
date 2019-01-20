package id.estock.app.presentation.home;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import id.estock.app.R;
import id.estock.app.databinding.ItemHomeCaraouselBinding;
import id.estock.app.databinding.ItemHomeContentBinding;

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private HomeModel mData;
    private FragmentManager mFragmentManager;

    public HomeAdapter(HomeModel model, FragmentManager fragmentManager){
        mData = model;
        mFragmentManager = fragmentManager;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case R.layout.item_home_content:
                ItemHomeContentBinding binding = ItemHomeContentBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
                return new HomeItemViewHolder(binding);
            default:
                ItemHomeCaraouselBinding itemHomeContentCaraoselBinding = ItemHomeCaraouselBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
                return new HomeHighlightViewHolder(itemHomeContentCaraoselBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof HomeHighlightViewHolder) {
            HomeHighlightViewHolder homeHighlightViewHolder = (HomeHighlightViewHolder) viewHolder;
            homeHighlightViewHolder.bind(mData.getCaraouselModels(), mFragmentManager);
        } else {
            HomeItemViewHolder homeItemViewHolder = (HomeItemViewHolder) viewHolder;
            homeItemViewHolder.bind(mData.getContentModels().get(position - 1));
        }
    }


    @Override
    public int getItemViewType(int position) {
        return position == 0 ? R.layout.item_home_caraousel : R.layout.item_home_content;
    }

    @Override
    public int getItemCount() {
        return mData.getContentModels().size() + 1;
    }

    public void replaceData(HomeModel value) {
        mData = value;
        notifyDataSetChanged();
    }


    class HomeHighlightViewHolder extends RecyclerView.ViewHolder {

        private ItemHomeCaraouselBinding mBinding;

        public HomeHighlightViewHolder(@NonNull ItemHomeCaraouselBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(List<HomeModel.HomeCorouselItemModel> caraouselModels, FragmentManager mFragmentManager) {
            mBinding.pagerHome.setAdapter(new HomePagerAdapter(mFragmentManager, caraouselModels));
            mBinding.pagerHome.setOffscreenPageLimit(caraouselModels.size());
            if (mBinding.pagerHome.getAdapter() != null) {
                mBinding.pagerHome.getAdapter().notifyDataSetChanged();
            }
            mBinding.setMData(caraouselModels);
        }
    }

    class HomeItemViewHolder extends RecyclerView.ViewHolder {

        private ItemHomeContentBinding mBinding;

        public HomeItemViewHolder(@NonNull ItemHomeContentBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(HomeModel.HomeContentItemModel homeContentItemModel) {
            mBinding.setMData(homeContentItemModel);
        }
    }



}
