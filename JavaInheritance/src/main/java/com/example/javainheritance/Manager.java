package com.example.javainheritance;

public class Manager extends Employee {

    private String teamAllocated;

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
}
