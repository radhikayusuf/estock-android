package id.estock.app.presentation.profile;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import id.estock.app.utils.base.BaseViewModel;

public class ProfileViewModel extends BaseViewModel {

    public ObservableField<ProfileModel> mData = new ObservableField<>();

    public ProfileViewModel(@NonNull Application application) {
        super(application);
    }
}
