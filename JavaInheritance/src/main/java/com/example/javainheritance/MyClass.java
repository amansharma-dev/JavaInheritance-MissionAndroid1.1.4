package com.example.javainheritance;

public class MyClass {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Mathews");
        employee.setType("Executive");
        employee.setWorkingPeriod(4.5f);
        employee.setAge(45);
        employee.setSalary(45000.56);
        employee.setId(1123);


        System.out.println(employee.getFirstName()+" "+employee.getType()+" "+employee.getSalary());

        Manager manager = new Manager();
        manager.setFirstName("Will");
        manager.setLastName("Smith");
        manager.setType("Manager");
        manager.setTeamAllocated("Sales");

        System.out.println("First Name: "+manager.getFirstName()+" & Last Name: "+manager.getLastName()+", Employee Type: "+manager.getType()+", Team Allocated: "+manager.getTeamAllocated());
    }
}
