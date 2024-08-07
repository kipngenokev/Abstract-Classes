package dev.lpa;

import java.util.ArrayList;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);


    }

    @Override
    public void move(String speed) {

        if(speed=="slow"){
            System.out.println(type +" lazily swimming");
        }else {
            System.out.println(type =" darting frantically");
        }
    }

    @Override
    public void makeNoise() {

        if(type=="Goldfish"){
            System.out.println("swish");
        }else {
            System.out.println("splash");
        }
    }
}
