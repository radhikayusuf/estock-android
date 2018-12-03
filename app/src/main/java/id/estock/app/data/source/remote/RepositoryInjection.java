package id.estock.app.data.source.remote;

import android.support.annotation.NonNull;

import id.estock.app.StockApp;
import id.estock.app.data.StockRepository;
import id.estock.app.data.source.local.StockLocalDataSource;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public class RepositoryInjection {

    private static final RepositoryInjection ourInstance = new RepositoryInjection();

    public static RepositoryInjection getInstance() {
        return ourInstance;
    }

    private StockRepository mRepository;

    private RepositoryInjection() {
         mRepository = new StockRepository(new StockRemoteDataSource(), new StockLocalDataSource(StockApp.getContext()));
    }

    public StockRepository getRepository() {
        return mRepository;
    }
}
