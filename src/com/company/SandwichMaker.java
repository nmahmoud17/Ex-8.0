package com.company;

public class SandwichMaker {

    public static void main(String[] args) {

        Sandwich mySandwich1 = new Sandwich();
        mySandwich1.describeSandwich();

        System.out.println ('\n');

        Sandwich mySandwich2 = new Sandwich( "Pastrami", "Havarti", false);
        mySandwich2.describeSandwich();

        System.out.println ('\n');

        Sandwich mySandwich3 = new Sandwich ( "Italian", "Beef", "cheddar", true);
        mySandwich3.describeSandwich();
    }
}
