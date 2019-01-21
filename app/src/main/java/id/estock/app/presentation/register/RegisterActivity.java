package id.estock.app.presentation.register;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

public class RegisterActivity extends BaseActivity<RegisterFragment> {

    public static void startThisActivity(Context context) {
        context.startActivity(new Intent(context, RegisterActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_register;
    }

    @Override
    public RegisterFragment onCreateFragment() {
        return RegisterFragment.newInstance();
    }

    @Override
    public void onViewReady() {

    }
}
