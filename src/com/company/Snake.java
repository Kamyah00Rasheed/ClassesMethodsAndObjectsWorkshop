package com.company;

public class Snake extends Pet {

            String color;
            int lengthInCM;
            double weight;
            char gender;
            boolean venemous;

    public Snake(String ownerName, String petName, int age, char gender, String homeAddress, String color, int lengthInCM, double weight, boolean venemous) {
        super(ownerName, petName, age, gender, homeAddress);
        this.color = color;
        this.lengthInCM = lengthInCM;
        this.weight = weight;
        this.venemous = venemous;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLengthInCM() {
        return lengthInCM;
    }

    public void setLengthInCM(int lengthInCM) {
        this.lengthInCM = lengthInCM;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public char getGender() {
        return gender;
    }

    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isVenemous() {
        return venemous;
    }

    public void setVenemous(boolean venemous) {
        this.venemous = venemous;
    }
}
