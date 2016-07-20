package com.softdesign.devintensive.data.network;

import com.softdesign.devintensive.data.network.req.UserLoginRequest;
import com.softdesign.devintensive.data.network.res.UserPhotoRes;
import com.softdesign.devintensive.data.network.res.UserListRes;
import com.softdesign.devintensive.data.network.res.UserModelRes;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface RestService {

    @POST("login")
    Call<UserModelRes> loginUser(@Body UserLoginRequest req);

    @GET("user/{userId}")
    Call<UserModelRes.User> getUserData(@Path("userId") String userId);

    @Multipart
    @POST("user/{userId}/publicValues/profilePhoto")
    Call<UserPhotoRes> uploadUserPhoto(@Path("userId") String userId,
                                                  @Part MultipartBody.Part file);
    @Multipart
    @POST("user/{userId}/publicValues/profileAvatar")
    Call<UserPhotoRes> uploadUserAvatar(@Path("userId") String userId,
                                                   @Part MultipartBody.Part file);

    @GET("user/list?orderBy=rating")
    Call<UserListRes> getUserList();

}
