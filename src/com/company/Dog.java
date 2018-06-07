package com.company;

public class Dog extends Pet{

    String name;
    String furColor;
    int legs;
    double weight;
    String dogBreed;
    char gender;

    public Dog(String ownerName, String petName, int age, char gender, String homeAddress, String name, String furColor, int legs, double weight, char gender1) {
        super(ownerName, petName, age, gender, homeAddress);
        this.name = name;
        this.furColor = furColor;
        this.legs = legs;
        this.weight = weight;
        this.gender = gender1;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

