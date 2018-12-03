package id.estock.app.data;

import android.support.annotation.NonNull;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public interface StockDataSource {

    void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback);


    interface PostLoginCallback {

        void onSuccess(Object data);

        void onError(String message);

    }

}
