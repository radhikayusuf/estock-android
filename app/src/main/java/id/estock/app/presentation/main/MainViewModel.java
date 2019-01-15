package id.estock.app.presentation.main;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import id.estock.app.utils.base.BaseViewModel;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class MainViewModel extends BaseViewModel {

    public final ObservableField<String> bText = new ObservableField<>("");


    public MainViewModel(@NonNull Application application) {
        super(application);

        bText.set("Hello E-Stock!");
    }
}
