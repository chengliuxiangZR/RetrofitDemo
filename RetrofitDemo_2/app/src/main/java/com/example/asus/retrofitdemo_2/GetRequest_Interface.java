package com.example.asus.retrofitdemo_2;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface GetRequest_Interface {
    @GET("/api/day/history")
    Call<Date_item> getCall();
}
