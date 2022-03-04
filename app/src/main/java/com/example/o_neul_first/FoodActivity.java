package com.example.o_neul_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.o_neul_first.connection.RetrofitSV;
import com.example.o_neul_first.models.foodmodels.FoodConditionEntity;
import com.example.o_neul_first.models.foodmodels.FoodVO;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodActivity extends AppCompatActivity {
    private List<CheckBox> chk_f_cookery;
    private List<CheckBox> chk_f_worlddiv;
    private List<CheckBox> chk_igd;
    private List<RadioButton> rg_f_alone;
    private Button condition_search;
    private TextView test_text;

    private List<String> f_cookery;
    private List<String> f_worlddiv;
    private List<String> igd;
    private int f_alone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_food);
        chk_f_cookery = new ArrayList<>();
        chk_f_worlddiv = new ArrayList<>();
        chk_igd = new ArrayList<>();
        rg_f_alone = new ArrayList<>();

        f_cookery = new ArrayList<>();
        f_worlddiv = new ArrayList<>();
        igd = new ArrayList<>();

        test_text = findViewById(R.id.test_text);

        chk_f_cookery.add(findViewById(R.id.check_f_cookery1));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery2));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery3));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery4));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery5));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery6));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery7));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery8));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery9));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery10));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery11));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery12));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery13));
        chk_f_cookery.add(findViewById(R.id.check_f_cookery14));

        chk_f_worlddiv.add(findViewById(R.id.check_f_worlddiv1));
        chk_f_worlddiv.add(findViewById(R.id.check_f_worlddiv2));
        chk_f_worlddiv.add(findViewById(R.id.check_f_worlddiv3));
        chk_f_worlddiv.add(findViewById(R.id.check_f_worlddiv4));

        chk_igd.add(findViewById(R.id.check_igd1));
        chk_igd.add(findViewById(R.id.check_igd2));
        chk_igd.add(findViewById(R.id.check_igd3));
        chk_igd.add(findViewById(R.id.check_igd4));

        rg_f_alone.add(findViewById(R.id.rg_f_alone1));
        rg_f_alone.add(findViewById(R.id.rg_f_alone2));

        condition_search = findViewById(R.id.condition_search);

        condition_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="";
                for(CheckBox chkb : chk_f_cookery){
                    if(chkb.isChecked()){
                        f_cookery.add(chk_f_cookery.indexOf(chkb)+1+"");
                        str += chk_f_cookery.indexOf(chkb)+1+", ";
                    }
                }
                for(CheckBox chkb : chk_f_worlddiv){
                    if(chkb.isChecked()){
                        f_worlddiv.add(chk_f_worlddiv.indexOf(chkb)+1+"");
                        str += chk_f_worlddiv.indexOf(chkb)+1+", ";
                    }
                }
                for(CheckBox chkb : chk_igd){
                    if(chkb.isChecked()){
                        igd.add(chk_igd.indexOf(chkb)+1+"");
                        str += chk_igd.indexOf(chkb)+1+", ";
                    }
                }
                for(RadioButton rdb : rg_f_alone){
                    if(rdb.isChecked()){
                        f_alone = rg_f_alone.indexOf(rdb);
                        str += f_alone;
                    }
                }
                FoodConditionEntity entity = new FoodConditionEntity();
                entity.setF_cookery(f_cookery);
                entity.setF_worlddiv(f_worlddiv);
                entity.setIgd(igd);
                entity.setAlone(f_alone);

                RetrofitSV.getConnect().selFood(entity).enqueue(new Callback<List<FoodVO>>() {
                    @Override
                    public void onResponse(Call<List<FoodVO>> call, Response<List<FoodVO>> response) {
                        List<FoodVO> list = response.body();
                        FoodVO vo = list.get(0);

                        Intent intent = new Intent(FoodActivity.this,FoodResultActivity.class);
                        intent.putExtra("FoodVO",vo);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<List<FoodVO>> call, Throwable t) {

                    }
                });
            }
        });


    }
}