package id.estock.app.data.source.local;

import android.content.Context;
import android.support.annotation.NonNull;

import id.estock.app.data.StockDataSource;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StockLocalDataSource implements StockDataSource {

    @NonNull
    private Context mContext;

    public StockLocalDataSource(@NonNull Context context) {
        mContext = context;
    }

    @Override
    public void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback) {

    }
}
