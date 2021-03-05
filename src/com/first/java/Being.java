package com.first.java;

public class Being {
    public static void main(String[] args) {
        Human human = new Human("ron",12);
        System.out.println(human.name);
        human.details();
        human.age_details();
        System.out.println("================================");
        Human human1 = new Human("yon",15);
        System.out.println(human1.name);
        human1.details();
        human1.age_details();

    }
}
