package com.softdesign.devintensive.data.network.res;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserPhotoRes {
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("updated")
    @Expose
    private String updated;

    public String getPhoto() {
        return photo;
    }
}
