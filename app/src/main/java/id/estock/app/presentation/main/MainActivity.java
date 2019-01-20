package id.estock.app.presentation.main;

import android.content.Context;
import android.content.Intent;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class MainActivity extends BaseActivity<MainFragment> {


    @Override
    public void onViewReady() {

    }

    @Override
    public int getLayoutRes() {
        return R.layout.main_activity;
    }

    @Override
    public MainFragment onCreateFragment() {
        return MainFragment.newInstance();
    }


    public static void startThisActivity(Context context){
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }

}
