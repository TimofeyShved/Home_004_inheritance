package com.company;

public class Toyota extends Car{ //наследование
    int numofspeed =2;

    @Override
    public void driving(){ //полиморфизм
        System.out.println("hrum-rum");
    }
}
