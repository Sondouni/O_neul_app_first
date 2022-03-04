package com.example.o_neul_first.connection;

import com.example.o_neul_first.models.foodmodels.FoodConditionEntity;
import com.example.o_neul_first.models.foodmodels.FoodVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface O_neulService {

    @POST("food")
    Call<List<FoodVO>> selFood(@Body FoodConditionEntity entity);
}
