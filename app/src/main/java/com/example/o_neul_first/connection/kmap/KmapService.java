package com.example.o_neul_first.connection.kmap;

import com.example.o_neul_first.models.jmtmodels.ResultSearchKeyword;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface KmapService {
    @GET("v2/local/search/keyword.json")
    Call<ResultSearchKeyword> getSearchKeywordbyCurloca(
            @Header("Authorization") String key,
            @Query("query") String query,
            @Query("x") String x,
            @Query("y") String y,
            @Query("category_group_code") String cate,
            @Query("radius") String radius
    );
}
