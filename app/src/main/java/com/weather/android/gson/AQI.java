package com.weather.android.gson;

/**
 * Created by My Pc on 2018/2/28.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
