package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    private double salary;

    public void work(){
        System.out.println("Junior Developer starts to working");
    }
    public JuniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }
}
