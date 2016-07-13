package com.softdesign.devintensive.data.managers;

import com.softdesign.devintensive.data.network.RestService;
import com.softdesign.devintensive.data.network.ServiceGenerator;
import com.softdesign.devintensive.data.network.req.UserLoginRequest;
import com.softdesign.devintensive.data.network.res.UserModelRes;

import retrofit2.Call;

public class DataManager {
    private static DataManager INSTANCE = null;
    private RestService mRestService;

    private PreferencesManager mPreferencesManager;

    private DataManager() {
        mPreferencesManager = new PreferencesManager();
        mRestService = ServiceGenerator.createService(RestService.class);
    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public PreferencesManager getPreferencesManager() {
        return mPreferencesManager;
    }

    //region =============== Network ===============
    public Call<UserModelRes> loginUser(UserLoginRequest userLoginReq) {
        return mRestService.loginUser(userLoginReq);
    }
    //end region

    //=============== Database ===============


}
