package id.estock.app.presentation.detailproduct;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import java.util.ArrayList;

import id.estock.app.data.model.StoreModel;
import id.estock.app.utils.base.BaseViewModel;

public class DetailProductViewModel extends BaseViewModel {

    public ObservableField<String> bId = new ObservableField<>();
    public ObservableField<DetailModel> bData = new ObservableField<>();


    public DetailProductViewModel(@NonNull Application application) {
        super(application);

        StoreModel store = new StoreModel("2", "Yongki Shoes", "https://scontent-sea1-1.cdninstagram.com/vp/46d82cafd76676a579429479d2e73c57/5CFB54D0/t51.2885-15/e35/21041411_2040312646255144_5238395190854549504_n.jpg?_nc_ht=scontent-sea1-1.cdninstagram.com&se=9&ig_cache_key=MTU4OTY4Njk0OTg2MDM3OTQ0MA%3D%3D.2");
        bData.set(new DetailModel("1", "New Balance 574", "https://nb.scene7.com/is/image/NB/wl574ew_nb_02_i?$pdpPictExp$", "", 1200000.0, store, new ArrayList<>()));
    }
}
