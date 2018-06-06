package com.company;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("Kamyah","Abby", 3,'f', "Louisville", true, 10.5 );

        System.out.println("The name of my cat is " +myCat.getPetName());

        myCat.setWhiskers(true);
        System.out.println("True or false, this cat has whiskers: " +myCat.isWhiskers() + ".");

        System.out.println(myCat.makeSound());
        System.out.println(myCat.catYears());
    }
}
