package com.example.brittany.travelingsalesman;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by brittany on 4/29/2016.
 */
public class Citys
{
    public String getName() {
        return name;
    }

    private String name;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String distance;
    private String destination;

    public Citys()
    {
       // this.name = name;
       // this.destination= "";
       //this.distance = 0;

    }


    public void addEdge(String start, String destination, String distance ) {

        String edge = "";
        start = Core.allCities.peek();
        setDestination(destination);
        setDistance(distance);
            edge = start +" -- "+ destination +" = "+distance+ " miles";
           Core.directions.addLast(edge);
        Core.allCities.pop();
    }


}