package id.estock.app.data.source.remote;

import android.support.annotation.NonNull;

import id.estock.app.data.StockDataSource;
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
    public void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback) {
        mApiService.postLogin(email, password)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Object>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Object o) {
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
}
