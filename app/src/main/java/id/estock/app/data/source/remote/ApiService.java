package id.estock.app.data.source.remote;

import java.util.List;

import id.estock.app.presentation.home.HomeModel;
import id.estock.app.presentation.profile.ProfileModel;
import id.estock.app.utils.base.BaseResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @Author Radhika Yusuf
 * Mon 3 Dec 2018
 */

public interface ApiService {

    @POST("user/login")
    Observable<ProfileModel> postLogin(String email, String password);


    @GET("v1/product")
    Observable<BaseResponse<List<HomeModel.HomeContentItemModel>>> getHomeProduct();

}
