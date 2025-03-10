package com.workintech.developers;

public class HRManager extends Employee{
    private double salary;

    private String[] juniorDeveloper;
    private String[] midDeveloper;
    private String[] seniorDeveloper;

    public void addEmployee(String level){
        if(level.equals("JuniorDeveloper")){
            juniorDeveloper[juniorDeveloper.length] = level;
        }else if(level.equals("MidDeveloper")){
            midDeveloper[midDeveloper.length] = level;
        }else if(level.equals("SeniorDeveloper")){
            seniorDeveloper[seniorDeveloper.length] = level;
        }
    }


    public void work(){
        System.out.println("HR Manager starts to working");
    }

    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }
}
