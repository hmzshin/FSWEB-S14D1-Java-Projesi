package com.s14d1.positions;

public class Employee {
    private int id;
    private String name;

    private long salary = 17000;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("com.s14d1.positions.Employee starts to work");
    }
}
