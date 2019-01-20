package id.estock.app.presentation.home.carousel;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.google.gson.Gson;

import id.estock.app.R;
import id.estock.app.databinding.ItemHomeContentCaraoselBinding;
import id.estock.app.presentation.home.HomeModel;
import id.estock.app.utils.base.BaseFragment;

import static id.estock.app.utils.Statics.GSON_FORMATTER_FOR_DATA;
import static id.estock.app.utils.Statics.KEY_BUNDLE_DATA;

public class HomeItemCarousel extends BaseFragment<ItemHomeContentCaraoselBinding, HomeItemCarouselViewModel> {


    public static HomeItemCarousel newInstance(HomeModel.HomeCorouselItemModel data) {
        Bundle b = new Bundle();
        b.putString(KEY_BUNDLE_DATA, GSON_FORMATTER_FOR_DATA.toJson(data));
        HomeItemCarousel fragment = new HomeItemCarousel();
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onCreateBinding(ItemHomeContentCaraoselBinding binding) {
        if (getArguments() != null && !getArguments().getString(KEY_BUNDLE_DATA, "").isEmpty()) {
            binding.setMData(GSON_FORMATTER_FOR_DATA.fromJson(getArguments().getString(KEY_BUNDLE_DATA, ""), HomeModel.HomeCorouselItemModel.class));
        }
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_home_content_caraosel;
    }

    @Override
    public Class<HomeItemCarouselViewModel> getViewModelClass() {
        return HomeItemCarouselViewModel.class;
    }
}
