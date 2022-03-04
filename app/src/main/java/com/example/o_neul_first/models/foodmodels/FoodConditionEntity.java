package com.example.o_neul_first.models.foodmodels;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FoodConditionEntity {
    private List<String> f_cookery;
    private List<String> f_worlddiv;
    private List<String> igd;
    private String f_nm;
    private int f_season;
    private String f_img;
    private int alknum;
    private int alone;
    private int fdnum;
    //페이징
    private int recordcount;
    private int rowcnt;
}
