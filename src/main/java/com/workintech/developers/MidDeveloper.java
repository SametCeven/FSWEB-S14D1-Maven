package com.workintech.developers;

public class MidDeveloper extends Employee{
    private double salary;

    public void work(){
        System.out.println("Mid Developer starts to working");
    }

    public MidDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }
}
