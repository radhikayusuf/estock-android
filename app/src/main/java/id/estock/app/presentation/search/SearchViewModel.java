package id.estock.app.presentation.search;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import id.estock.app.utils.base.BaseViewModel;

public class SearchViewModel extends BaseViewModel {

    public ObservableList<SearchModel> mData = new ObservableArrayList<>();

    public SearchViewModel(@NonNull Application application) {
        super(application);

        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
        mData.add(new SearchModel(0, "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", 1200000.0));
    }
}
