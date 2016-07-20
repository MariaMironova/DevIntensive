package com.softdesign.devintensive.utils;

import android.content.IntentSender;

/**
 * Created by Android on 25.06.2016.
 */
public interface ConstantManager {
    String TAG_PREFIX = "DEV ";

    String EDIT_MODE_KEY = "EDIT_MODE_KEY";

    String USER_PHONE_KEY = "USER_1_KEY";
    String USER_EMAIL_KEY = "USER_2_KEY";
    String USER_VK_KEY = "USER_3_KEY";
    String USER_GIT_KEY = "USER_4_KEY";
    String USER_BIO_KEY = "USER_5_KEY";
    String USER_PHOTO_KEY = "USER_PHOTO_KEY";
    String USER_ID_KEY = "USER_ID_KEY";
    String AUTH_TOKEN_KEY = "AUTH_TOKEN_KEY";
    String USER_RATING_VALUE = "USER_RATING_VALUE";
    String USER_CODE_LINES_VALUE = "USER_CODE_LINES_VALUE";
    String USER_PROJECTS_VALUE = "USER_PROJECTS_VALUE";
    String USER_AVATAR_KEY = "USER_AVATAR_KEY";
    String PARCELABLE_KEY = "PARCELABLE_KEY";
    String USER_FULLNAME_KEY = "USER_FULLNAME_KEY";

    int LOAD_PROFILE_PHOTO = 1;
    int REQUEST_CAMERA_PICTURE = 99;
    int REQUEST_GALLERY_PICTURE = 88;

    int PERMISSION_REQUEST_SETTINGS_CODE = 101;
    int CAMERA_REQUEST_PERMISSION_CODE = 102;

    int PHONE_REQUEST_PERMISSION_CODE = 104;

}
