package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(walk(65, -10));
        System.out.println(walk(25, 20));
        System.out.println(walk(15, 5));
        System.out.println(walk(42, 30));
        System.out.println(walk(19, 0));

        System.out.println(generateRandomAge());

    }

    public static String walk(int age, int temp) {
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)){
            return "Можно идти гулять";
        }
        else if (age < 20 && (temp > 0 && temp < 28)){
            return "Можно идти гулять";
        }
        else if (age > 45 && (temp > -10 && temp < 25)){
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }

    }
// не понимаю как привязать этот метод к предыдущему, напишите здесь пожалуйста)
    public static int generateRandomAge(){
        int age = (int) (Math.random() * 99);

        return age;
    }
}





