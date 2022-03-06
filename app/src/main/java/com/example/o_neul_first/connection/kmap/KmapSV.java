package com.example.o_neul_first.connection.kmap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class KmapSV {
    private static final String BASE_URL = "https://dapi.kakao.com/";
    private static Retrofit retrofit;
    private static KmapService service;

    public static KmapService getApiClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            service = retrofit.create(KmapService.class);
        }

        return service;
    }

}
