package id.estock.app.presentation.search;

import android.content.Context;
import android.content.Intent;

import id.estock.app.R;
import id.estock.app.utils.base.BaseActivity;

public class SearchActivity extends BaseActivity<SearchFragment> {

    @Override
    public int getLayoutRes() {
        return R.layout.activity_search;
    }

    @Override
    public SearchFragment onCreateFragment() {
        return SearchFragment.newInstance();
    }

    @Override
    public void onViewReady() {

    }

    public static void startThisActivity(Context context){
        Intent i = new Intent(context, SearchActivity.class);
        context.startActivity(i);
    }
}
