package com.example.brittany.travelingsalesman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Citys mequon = new Citys("Mequon", "Grafton", "8");
        Citys grafton = new Citys("Grafton", "Cedarburg", "5");
        Citys cedarburg = new Citys("Cedarburg", "Germantown", "16");
        Citys germantown = new Citys("Germantown", "Mequon", "11");
        Citys sheboygan = new Citys("Sheboygan", "Grafton", "28");
        Core.allCities.addLast(mequon.getStringofObject());
        Core.allCities.addLast(grafton.getStringofObject());
        Core.allCities.addLast(cedarburg.getStringofObject());
        Core.allCities.addLast(germantown.getStringofObject());
        Core.allCities.addLast(sheboygan.getStringofObject());
        System.out.println(Core.allCities);







    }




}
