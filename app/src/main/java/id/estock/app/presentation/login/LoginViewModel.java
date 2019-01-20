package id.estock.app.presentation.login;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import id.estock.app.R;
import id.estock.app.data.StockDataSource;
import id.estock.app.utils.base.BaseViewModel;

public class LoginViewModel extends BaseViewModel {

    public ObservableField<String> bUsername = new ObservableField<>("");
    public ObservableField<String> bPassword = new ObservableField<>("");
    public MutableLiveData<Boolean> bMovePage = new MutableLiveData<>();


    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public void doLogin(){
        if (validateValue()) {
            bMovePage.postValue(true);
//            mRepository.postLogin(bUsername.get(), bPassword.get(), new StockDataSource.PostLoginCallback() {
//                @Override
//                public void onSuccess(Object data) {
//                    bMovePage.postValue(true);
//                }
//
//                @Override
//                public void onError(String message) {
//
//                }
//            });
        }
    }

    private boolean validateValue(){
        if (bUsername.get().isEmpty()) {
            showMessageRes(R.string.error_username);
            return false;
        }

        if (bPassword.get().isEmpty()) {
            showMessageRes(R.string.error_password);
            return false;
        }

        return true;
    }

}
