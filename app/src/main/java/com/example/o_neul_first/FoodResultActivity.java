package com.example.o_neul_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.o_neul_first.models.foodmodels.FoodVO;

import net.daum.mf.map.api.MapView;


public class FoodResultActivity extends AppCompatActivity {
    private TextView text_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_food_result);

        Intent intent = getIntent();
        FoodVO vo = (FoodVO)intent.getSerializableExtra("FoodVO");


        text_result = findViewById(R.id.text_result);
        text_result.setText("오늘은 "+vo.getF_nm()+" 어떠세요?");



        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

    }
}