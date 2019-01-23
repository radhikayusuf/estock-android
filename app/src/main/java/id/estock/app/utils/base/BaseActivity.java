package id.estock.app.utils.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.estock.app.R;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public abstract class BaseActivity<F extends BaseFragment> extends AppCompatActivity {

    public F mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        mFragment = onCreateFragment();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, mFragment)
                    .commitNow();
        }
        onViewReady();
    }



    public abstract int getLayoutRes();
    public abstract F onCreateFragment();
    public abstract void onViewReady();
}
