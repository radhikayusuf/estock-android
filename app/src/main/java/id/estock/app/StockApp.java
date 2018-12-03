package id.estock.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class StockApp extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
