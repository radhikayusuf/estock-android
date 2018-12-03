package id.estock.app.data.source.remote;

import android.databinding.ObservableField;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public interface ApiService {

    @POST("user/login")
    Observable<Object> postLogin(String email, String password);

}
