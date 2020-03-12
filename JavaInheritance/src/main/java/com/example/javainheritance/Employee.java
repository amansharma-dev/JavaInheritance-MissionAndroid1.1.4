package com.example.javainheritance;

public class Employee extends Person {

    private int id;
    private double salary;

    public Employee(){}

    public Employee(int id, double salary){
        this.id= id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
