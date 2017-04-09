package com.ewallet.psu.psu.manager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HTTPManager {

    private static HTTPManager instance;
    final private Retrofit retrofit;

    public static HTTPManager getInstance() {
        if (instance == null)
            instance = new HTTPManager();
        return instance;
    }

    private HTTPManager(){
          retrofit = new Retrofit.Builder()
                .baseUrl("http://172.20.10.3:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit(){
        return retrofit;
    }
}