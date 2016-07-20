package com.softdesign.devintensive.utils;

import android.support.annotation.NonNull;

import com.redmadrobot.chronos.ChronosOperation;
import com.redmadrobot.chronos.ChronosOperationResult;
import com.softdesign.devintensive.data.managers.DataManager;
import com.softdesign.devintensive.data.storage.models.User;
import com.softdesign.devintensive.data.storage.models.UserDao;
import com.softdesign.devintensive.utils.DevintensiveApplication;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by Android on 20.07.2016.
 */
public class LoadFromDb extends ChronosOperation<List<User>> {

    String mQuery;

    public LoadFromDb(String query) {
        mQuery = query;
    }

    public LoadFromDb() {
    }

    @Nullable
    @Override
    public List<User> run() {
        final List<User> result;
        if (mQuery == null || mQuery.isEmpty()) {
            result = DataManager.getInstance().getUserListFromDb();
        } else {
            result = DataManager.getInstance().getUserListByName(mQuery);
        }
        return result;
    }

    @NonNull
    @Override
    public Class<Result> getResultClass() {
        return Result.class;
    }


    public final static class Result extends ChronosOperationResult<List<User>> {

    }
}
