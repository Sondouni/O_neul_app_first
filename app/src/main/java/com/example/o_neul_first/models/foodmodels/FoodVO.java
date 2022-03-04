package com.example.o_neul_first.models.foodmodels;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodVO implements Serializable {
    private int ifood;
    private String f_cookery;
    private String f_nm;
    private String  f_season;
    private String f_worlddiv;
    private String f_alone;
    private String f_img;
    private String igd;
    private String alk;
}
