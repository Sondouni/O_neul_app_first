package com.example.o_neul_first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {
    private List<CheckBox> chk_f_cookery;
    private List<CheckBox> chk_f_worlddiv;
    private List<CheckBox> chk_igd;
    private List<RadioButton> rg_f_alone;
    private Button condition_search;

    private List<Integer> f_cookery;
    private List<Integer> f_worlddiv;
    private List<Integer> igd;
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

        condition_search.findViewById(R.id.condition_search);

        condition_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}