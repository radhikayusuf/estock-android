package id.estock.app.presentation.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import id.estock.app.databinding.ItemHomeContentBinding;

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private HomeModel mData;
    private HomeUserActionListener mListener;

    public HomeAdapter(HomeModel model, HomeUserActionListener listener) {
        mData = model;
        mListener = listener;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemHomeContentBinding binding = ItemHomeContentBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
        return new HomeItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        HomeItemViewHolder homeItemViewHolder = (HomeItemViewHolder) viewHolder;
        homeItemViewHolder.bind(mData.getContentModels().get(position), mListener);
    }


    @Override
    public int getItemCount() {
        return mData.getContentModels().size();
    }

    public void replaceData(HomeModel value) {
        mData = value;
        notifyDataSetChanged();
    }


    class HomeItemViewHolder extends RecyclerView.ViewHolder {

        private ItemHomeContentBinding mBinding;

        public HomeItemViewHolder(@NonNull ItemHomeContentBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(HomeModel.HomeContentItemModel homeContentItemModel, HomeUserActionListener mListener) {
            mBinding.setMData(homeContentItemModel);
            mBinding.setMListener(mListener);
        }
    }


}
