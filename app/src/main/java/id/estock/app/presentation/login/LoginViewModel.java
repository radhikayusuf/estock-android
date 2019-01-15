package id.estock.app.presentation.login;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import id.estock.app.presentation.splash.Test;
import id.estock.app.utils.base.BaseViewModel;

public class LoginViewModel extends BaseViewModel {

    public final ObservableField<String> bText = new ObservableField<>("");

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }
}
