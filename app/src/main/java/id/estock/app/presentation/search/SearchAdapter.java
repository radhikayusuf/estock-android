package id.estock.app.presentation.search;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import id.estock.app.databinding.ItemSearchBinding;

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<SearchModel> mData;

    public SearchAdapter(List<SearchModel> model) {
        mData = model;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemSearchBinding binding = ItemSearchBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
        return new SearchItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        SearchItemViewHolder homeItemViewHolder = (SearchItemViewHolder) viewHolder;
        homeItemViewHolder.bind(mData.get(position));
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void replaceData(List<SearchModel> value) {
        mData = value;
        notifyDataSetChanged();
    }


    class SearchItemViewHolder extends RecyclerView.ViewHolder {

        private ItemSearchBinding mBinding;

        public SearchItemViewHolder(@NonNull ItemSearchBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(SearchModel homeContentItemModel) {
            mBinding.setMData(homeContentItemModel);
        }
    }


}
