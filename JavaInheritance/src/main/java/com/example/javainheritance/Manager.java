package com.example.javainheritance;

public class Manager extends Employee {

    private String teamAllocated;

    //override super class
    @Override
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public Manager(){}
    public Manager(String teamAllocated){
        this.teamAllocated = teamAllocated;
    }

    public String getTeamAllocated() {
        return teamAllocated;
    }

    public void setTeamAllocated(String teamAllocated) {
        this.teamAllocated = teamAllocated;
    }

    // to string override

    @Override
    public String toString() {
        return "First Name: "+this.getFirstName()+", Last Name: "+this.getLastName()+", Type: "+this.getType()
                +",Working Period: "+this.getWorkingPeriod()+", Age: "+this.getAge()+", Team Allocated: "+this.getTeamAllocated()
                +", Salary: "+this.getSalary();
    }
}
