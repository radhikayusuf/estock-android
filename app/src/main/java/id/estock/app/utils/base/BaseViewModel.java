package id.estock.app.utils.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import id.estock.app.data.StockRepository;
import id.estock.app.data.source.remote.RepositoryInjection;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class BaseViewModel extends AndroidViewModel {

    @NonNull
    protected StockRepository mRepository = RepositoryInjection.getInstance().getRepository();

    android.arch.lifecycle.MutableLiveData<String> mShowMessage = new MutableLiveData<>();
    android.arch.lifecycle.MutableLiveData<Integer> mShowMessageRes = new MutableLiveData<>();


    public BaseViewModel(@NonNull Application application) {
        super(application);
    }


    public void showMessage(String message){
        mShowMessage.postValue(message);
    }

    public void showMessageRes(@StringRes Integer text){
        mShowMessageRes.postValue(text);
    }


    public void start() {

    }
}
