package com.first.java;

public class Human {

    String name ;
    int age;


    Human(String name,int age ){
        this.name=name;
        this.age=age;

    }

    void details(){
        System.out.println(this.name+" is unknown");
    }

    void age_details(){
        System.out.println(this.age+" person is "+this.name);
    }

}
