package com.softdesign.devintensive.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Android on 29.06.2016.
 */
public class DevintensiveApplication extends Application {
    public static SharedPreferences sSharedPreferences;
    private static Context mContext;

    @Override
    public void onCreate() {
        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mContext = this;
        super.onCreate();
    }

    public static SharedPreferences getSharedPreferences() {
        return sSharedPreferences;
    }

    public static Context getContext() {
        return mContext;
    }
}
