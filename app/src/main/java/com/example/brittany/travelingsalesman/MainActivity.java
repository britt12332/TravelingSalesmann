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
       Core.addingallCities();
       // Core.displayCitys();

        //System.out.println();
        Citys c = new Citys();
        c.addEdge(Core.allCities.peek(),"Grafton", "8");
        c.addEdge(Core.allCities.peek(),"Cedarburg", "5");
        c.addEdge(Core.allCities.peek(),"Germantown", "13");
        c.addEdge(Core.allCities.peek(),"Mequon", "10");
        c.addEdge(Core.allCities.peek(),"Grafton", "28");
        System.out.println(Core.directions);






    }




}
