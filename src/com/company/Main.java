package com.company;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("Kamyah","Abby", 3,'f', "Louisville", true, 10.5 );

        Snake mySnake= new Snake("Kamyah", "Charlie",2, 'M', "Louisville","Green and brown", 24, 20.0,false);

        Dog myDog= new Dog("Kamyah","Peanut",4,'F',"Louisville","Peanut","Golden Brown",4,31.2,'F');

        System.out.println("The name of my cat is " +myCat.getPetName());
        myCat.setWhiskers(true);
        System.out.println("True or false, this cat has whiskers: " +myCat.isWhiskers() + ".");
        System.out.println(myCat.makeSound());
        System.out.println(myCat.catYears());

        System.out.println("The name of my snake is " +mySnake.getPetName());
        mySnake.setVenemous(false);
        System.out.println("True or false this snake is venemous: "+mySnake.isVenemous());

        System.out.println("The name of my dog is "+ myDog.getPetName());

        /*
        1. ls
        2. cd....
        3. cd IdeaProjects
        4. cd ClassesMethodsAndObjectsWorkshop
        5. git add .
        6. git commit -m "message"
        7. git push origin master









         */
    }
}
