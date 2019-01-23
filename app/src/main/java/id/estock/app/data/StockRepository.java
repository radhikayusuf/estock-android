package id.estock.app.data;

import android.support.annotation.NonNull;

import id.estock.app.data.source.local.StockLocalDataSource;
import id.estock.app.data.source.remote.StockRemoteDataSource;
import id.estock.app.presentation.profile.ProfileModel;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StockRepository implements StockDataSource {

    @NonNull
    private StockRemoteDataSource mRemoteDataSource;

    @NonNull
    private StockLocalDataSource mLocalDataSource;


    public StockRepository(@NonNull StockRemoteDataSource mRemoteDataSource, @NonNull StockLocalDataSource mLocalDataSource) {
        this.mRemoteDataSource = mRemoteDataSource;
        this.mLocalDataSource = mLocalDataSource;
    }

    @Override
    public void getProducts(@NonNull GetProductCallback callback) {
        mRemoteDataSource.getProducts(callback);
    }

    @Override
    public void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback) {
        mRemoteDataSource.postLogin(email, password, new PostLoginCallback() {
            @Override
            public void onSuccess(ProfileModel data) {
                callback.onSuccess(data);
                saveUserData(data);
            }

            @Override
            public void onError(String message) {
                callback.onError(message);
            }
        });
    }

    @Override
    public void saveUserData(ProfileModel data) {
        mLocalDataSource.saveUserData(data);
    }

    @Override
    public ProfileModel getUserData() {
        return mLocalDataSource.getUserData();
    }


}
