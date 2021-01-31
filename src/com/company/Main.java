package com.company;

// наследование, полиморфизм и инкапсуляция

public class Main {

    public static void main(String[] args) {
	    Toyota car1 = new Toyota();
	    System.out.println(car1.getMaxSpeed());
	    System.out.println(car1.numofspeed); //наследование
        // write your code here
        new Car().driving(); //полиморфизм
        car1.driving();
        Person man = new Person(); //инкапсуляция
        man.setName("Tom");
        System.out.println(man.getName());
    }
}
