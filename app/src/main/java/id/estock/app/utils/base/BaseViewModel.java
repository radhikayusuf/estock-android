package id.estock.app.utils.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import id.estock.app.data.StockRepository;
import id.estock.app.data.source.remote.RepositoryInjection;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class BaseViewModel extends AndroidViewModel {

    @NonNull
    protected StockRepository mRepository = RepositoryInjection.getInstance().getRepository();


    public BaseViewModel(@NonNull Application application) {
        super(application);
    }
}
