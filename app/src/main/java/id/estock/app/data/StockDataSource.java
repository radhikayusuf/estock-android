package id.estock.app.data;

import android.support.annotation.NonNull;

import java.util.List;

import id.estock.app.presentation.home.HomeModel;
import id.estock.app.presentation.profile.ProfileModel;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public interface StockDataSource {

    void getProducts(@NonNull GetProductCallback callback);

    void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback);


    void saveUserData(ProfileModel data);

    ProfileModel getUserData();


    interface PostLoginCallback {

        void onSuccess(ProfileModel data);

        void onError(String message);

    }


    interface GetProductCallback {

        void onSuccess(List<HomeModel.HomeContentItemModel> data);

        void onError(String message);

    }

}
