package id.estock.app.data.source.local;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.google.gson.Gson;

import id.estock.app.data.StockDataSource;
import id.estock.app.presentation.profile.ProfileModel;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StockLocalDataSource implements StockDataSource {

    @NonNull
    private Context mContext;
    private SharedPreferences mPref;

    public StockLocalDataSource(@NonNull Context context) {
        mContext = context;
        mPref = mContext.getSharedPreferences("STORAGE-CONTENTT", Context.MODE_PRIVATE);
    }

    @Override
    public void getProducts(@NonNull GetProductCallback callback) {

    }

    @Override
    public void postLogin(@NonNull String email, @NonNull String password, @NonNull PostLoginCallback callback) {

    }

    @Override
    public void saveUserData(ProfileModel data) {
        mPref.edit().putString("USER-KEY", new Gson().toJson(data)).apply();
    }

    @Override
    public ProfileModel getUserData() {
        if (!mPref.getString("USER-KEY", "").isEmpty()) {
            return new Gson().fromJson(mPref.getString("USER-KEY", ""), ProfileModel.class);
        } else {
            return null;
        }

    }
}
