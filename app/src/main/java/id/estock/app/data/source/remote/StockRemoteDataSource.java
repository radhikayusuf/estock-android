package id.estock.app.data.source.remote;

import android.support.annotation.NonNull;

import java.util.List;

import id.estock.app.data.StockDataSource;
import id.estock.app.presentation.home.HomeModel;
import id.estock.app.presentation.profile.ProfileModel;
import id.estock.app.utils.base.BaseResponse;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StockRemoteDataSource implements StockDataSource {

    private ApiService mApiService;

    public StockRemoteDataSource() {
        this.mApiService = ApiFactory.getApiService();
    }

    @Override
    public void getProducts(@NonNull GetProductCallback callback) {
        mApiService.getHomeProduct()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<List<HomeModel.HomeContentItemModel>>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse<List<HomeModel.HomeContentItemModel>> listBaseResponse) {
                        if (listBaseResponse.getStatus()) {
                            callback.onSuccess(listBaseResponse.getData());
                        } else {
                            callback.onError(listBaseResponse.getMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback) {
        mApiService.postLogin(email, password)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ProfileModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ProfileModel o) {
                        if (o != null) {
                            callback.onSuccess(o);
                        } else {
                            callback.onError("Something wrong");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void saveUserData(ProfileModel data) {

    }

    @Override
    public ProfileModel getUserData() {
        return null;
    }
}
