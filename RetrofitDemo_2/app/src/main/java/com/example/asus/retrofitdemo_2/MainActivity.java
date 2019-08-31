package com.example.asus.retrofitdemo_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick_2(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io")
                //设置数据解析器
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class );
        Call<Date_item> call = request.getCall();
        call.enqueue(new Callback<Date_item>() {
            @Override
            public void onResponse(Call<Date_item> call, Response<Date_item> response) {
                Log.i("Hello", "Response=" + response.body());
            }

            @Override
            public void onFailure(Call<Date_item> call, Throwable t) {
                Log.i("Hello", "错误");
            }
        });
    }
}
