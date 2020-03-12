package com.example.javainheritance;

public class Person {

    private String firstName;
    private String lastName;
    private String type;
    private float workingPeriod;
    private int age;

    public Person(){}

    public Person(String firstName, String lastName, String type, float workingPeriod, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.workingPeriod = workingPeriod;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWorkingPeriod() {
        return workingPeriod;
    }

    public void setWorkingPeriod(float workingPeriod) {
        this.workingPeriod = workingPeriod;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
