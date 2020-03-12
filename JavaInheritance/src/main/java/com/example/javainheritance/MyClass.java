package com.example.javainheritance;

public class MyClass {

    public static void main(String[] args) {

        //using String as a Object
        String message = "hello";
        boolean isEmpty = message.isEmpty();
        boolean contains = message.contains("h");

        if(!contains){
            System.out.println("no h found");
        }
        else{
            System.out.println("h found in message, yahoo....");
        }

        if(!isEmpty){
            System.out.println(message);
        }
        else{
            System.out.println("Empty");
        }

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
        manager.setAge(29);
        manager.setWorkingPeriod(2.5f);
        manager.setTeamAllocated("Sales");
        manager.setSalary(970000);

       // System.out.println("First Name: "+manager.getFirstName()+" & Last Name: "+manager.getLastName()+", Employee Type: "+manager.getType()+", Team Allocated: "+manager.getTeamAllocated()+",  Salary is: "+manager.getSalary());

        System.out.println(manager);
    }
}
