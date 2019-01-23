package id.estock.app.presentation.detailproduct;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

import static id.estock.app.utils.Statics.KEY_ID_DATA;

public class DetailProductActivity extends BaseActivity<DetailProductFragment> {


    @Override
    public int getLayoutRes() {
        return R.layout.activity_detail_product;
    }

    @Override
    public DetailProductFragment onCreateFragment() {
        return DetailProductFragment.newInstance();
    }

    @Override
    public void onViewReady() {

    }

    public static void startThisActivity(Context context, @NonNull String id){
        Intent i = new Intent(context, DetailProductActivity.class);
        i.putExtra(KEY_ID_DATA, id);
        context.startActivity(i);
    }
}
