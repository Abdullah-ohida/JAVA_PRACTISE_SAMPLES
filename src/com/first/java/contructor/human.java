package com.first.java.contructor;

public class human {

    String name= "town";
    int ID;

    human(String name,int ID){
        this.name=name;
        this.ID=ID;
    }

    public void welcome(){
        System.out.println("hello "+ this.name+ " your are welcome!!!");
    }

}
