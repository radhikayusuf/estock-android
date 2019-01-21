package id.estock.app.presentation.splash;

import android.os.Handler;

import id.estock.app.R;
import id.estock.app.presentation.main.MainActivity;
import id.estock.app.utils.base.BaseActivity;

public class SplashActivity extends BaseActivity<SplashFragment> {


    @Override
    public int getLayoutRes() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashFragment onCreateFragment() {
        return SplashFragment.newInstance();
    }

    @Override
    public void onViewReady() {
        new Handler().postDelayed(() -> {
            MainActivity.startThisActivity(getBaseContext());
            finish();
        }, 2000);
    }
}
