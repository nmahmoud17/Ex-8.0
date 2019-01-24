package com.company;

public class Sandwich {

    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public void setBreadType (String theBreadType) {
        breadType=theBreadType;
    }

    public String getBreadType () {
        return breadType;
    }

    public void setProteinType (String theProteinType) {
        proteinType=theProteinType;
    }

    public String getProteinType () {
        return proteinType;
    }

    public void setCheeseType (String theCheeseType) {
        cheeseType=theCheeseType;
    }

    public String getCheeseType () {
        return cheeseType;
    }

    public void setVeggies (String theVeggies) {
        veggies = true;
    }

    public boolean getVeggies () {
        return veggies;
    }

    public Sandwich() {
        breadType = "Italian";
        proteinType = "Chicken";
        cheeseType = "Pepper Jack";
        veggies = true;


    }
    public Sandwich (String proteinType1,String cheeseType1, boolean veggies1 ) {
        breadType = "Whole Grain";
        proteinType = proteinType1;
        cheeseType = cheeseType1;
        veggies = veggies1;

    }
    public Sandwich (String breadType1, String proteinType1,String cheeseType1, boolean veggies1 ) {
        breadType = breadType1;
        proteinType = proteinType1;
        cheeseType = cheeseType1;
        veggies = veggies1;

    }


    public void describeSandwich () {
        System.out.println("Sandwich is on " + getBreadType() + " bread");
        System.out.println("It has " + getProteinType() + " and " + getCheeseType());
        System.out.println("with " + "veggies? " + getVeggies());
    }


}
