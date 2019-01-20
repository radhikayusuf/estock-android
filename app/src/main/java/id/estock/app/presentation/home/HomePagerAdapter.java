package id.estock.app.presentation.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import id.estock.app.presentation.home.carousel.HomeItemCarousel;

public class HomePagerAdapter extends FragmentPagerAdapter {

    private List<HomeModel.HomeCorouselItemModel> mData;


    public HomePagerAdapter(FragmentManager fm, List<HomeModel.HomeCorouselItemModel> data) {
        super(fm);
        mData = data;
    }

    @Override
    public Fragment getItem(int i) {
        return HomeItemCarousel.newInstance(mData.get(i));
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    public void replaceData(List<HomeModel.HomeCorouselItemModel> data) {
        mData = data;
        notifyDataSetChanged();
    }
}
