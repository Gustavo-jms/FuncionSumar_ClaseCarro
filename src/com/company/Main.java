package com.company;

public class Main {

    public static void main(String[] args) {
	    int resultant = 0;
        resultant = suma(1, 2, 3);

        System.out.println(resultant);

        Car myCar = new Car();
        myCar.addDoors();

        System.out.println(myCar.doors);

    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
