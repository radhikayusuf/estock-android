package id.estock.app.utils.base;

import android.databinding.BindingAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import id.estock.app.presentation.home.HomeAdapter;
import id.estock.app.presentation.home.HomeModel;
import id.estock.app.presentation.home.HomePagerAdapter;
import id.estock.app.utils.StringHelper;

public class EStockBindings {

    @BindingAdapter("app:setIDRtext")
    public static void setIdrText(TextView textView, double price){
        textView.setText(StringHelper.convertToIDR(price));
    }

    @BindingAdapter("app:homePagerAdapter")
    public static void setHomeCarouselData(ViewPager viewPager, List<HomeModel.HomeCorouselItemModel> data){
        if (viewPager.getAdapter() != null) {
            HomePagerAdapter homePagerAdapter = (HomePagerAdapter) viewPager.getAdapter();
            homePagerAdapter.replaceData(data);
            viewPager.setOffscreenPageLimit(data.size());
        }
    }


    @BindingAdapter("app:imageUrl")
    public static void setImageUrl(ImageView imageView, Object value){
        Glide.with(imageView.getContext())
                .load(value)
                .into(imageView);

    }

    @BindingAdapter("app:homeList")
    public static void setHomeList(RecyclerView recyclerView, HomeModel value){
        if (recyclerView.getAdapter() != null) {
            if (recyclerView.getAdapter() instanceof HomeAdapter) {
                HomeAdapter homeAdapter = (HomeAdapter) recyclerView.getAdapter();
                homeAdapter.replaceData(value);
            }
        }
    }


}
