package id.estock.app.presentation.search;


import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import id.estock.app.R;
import id.estock.app.databinding.FragmentSearchBinding;
import id.estock.app.utils.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends BaseFragment<FragmentSearchBinding, SearchViewModel> {


    public static SearchFragment newInstance(){
        return new SearchFragment();
    }


    @Override
    public void onCreateBinding(FragmentSearchBinding binding) {
        final SearchAdapter adapter =  new SearchAdapter(mViewModel.mData);
        LinearLayoutManager layoutManager = new GridLayoutManager(requireContext(), 2);
        binding.recyclerSearch.setLayoutManager(layoutManager);
        binding.recyclerSearch.setAdapter(adapter);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_search;
    }

    @Override
    public Class<SearchViewModel> getViewModelClass() {
        return SearchViewModel.class;
    }

}
