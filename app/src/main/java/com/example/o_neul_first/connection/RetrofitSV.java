package com.example.o_neul_first.connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSV {
    private static Retrofit rt;
    private static O_neulService oNeulService;
    public static O_neulService getConnect(){
        if(rt==null){
            rt = new Retrofit.Builder()
                    .baseUrl("http://172.30.1.17:8090/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            oNeulService = rt.create(O_neulService.class);
        }
        return oNeulService;
    }
}
