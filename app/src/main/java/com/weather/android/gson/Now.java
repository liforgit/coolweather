package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My Pc on 2018/2/28.
 */

public class Now {

    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
