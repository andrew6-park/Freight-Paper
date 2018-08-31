package com.korealogis.freightpaper2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    private static Retrofit getClient(){
        retrofit = new Retrofit.Builder().baseUrl(URL.REQUEST_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static ICall get() {
        return getClient().create(ICall.class);
    }
}
