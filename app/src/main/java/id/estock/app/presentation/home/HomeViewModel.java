package id.estock.app.presentation.home;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import java.util.List;

import id.estock.app.data.StockDataSource;
import id.estock.app.utils.base.BaseViewModel;

public class HomeViewModel extends BaseViewModel {

    public ObservableList<HomeModel.HomeCorouselItemModel> mDataCarousel = new ObservableArrayList<>();
    public ObservableList<HomeModel.HomeContentItemModel> mDataContentItem = new ObservableArrayList<>();
    public ObservableField<HomeModel> mHomeModel = new ObservableField<>(new HomeModel(mDataCarousel, mDataContentItem));


    public HomeViewModel(@NonNull Application application) {
        super(application);

        mDataCarousel.add(new HomeModel.HomeCorouselItemModel(1, "Nike", "Air Max", "http://moresneakers.com/wp-content/uploads/2017/12/908375-105_launches_hero_landscape_1.jpg"));
        mDataCarousel.add(new HomeModel.HomeCorouselItemModel(2, "Adidas", "Ultra Boost", "https://cdn.thesolesupplier.co.uk/2018/09/ADIDAS_ORIGINALS_ULTRA_BOOST_GOLD_MEDAL_SILVER_MEDAL_OLYMPIC_PACK-54.jpg"));
        mDataCarousel.add(new HomeModel.HomeCorouselItemModel(3, "New Balance", "Running shoes", "https://launches-api.endclothing.com/public/MSX90ED_launches_hero_landscape_2.jpg"));

        mRepository.getProducts(new StockDataSource.GetProductCallback() {
            @Override
            public void onSuccess(List<HomeModel.HomeContentItemModel> data) {
                mDataContentItem.clear();
                mDataContentItem.addAll(data);
            }

            @Override
            public void onError(String message) {

            }
        });
    }
}
