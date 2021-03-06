package id.estock.app.presentation.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginFragment> {

    public static void startThisActivity(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_login;
    }

    @Override
    public LoginFragment onCreateFragment() {
        return LoginFragment.newInstance();
    }

    @Override
    public void onViewReady() {

    }
}
