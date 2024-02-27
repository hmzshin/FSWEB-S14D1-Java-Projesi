package com.s14d1.developerCompany;

import com.s14d1.developerCompany.Employee;

public class JuniorDeveloper extends Employee {
    private long salary;

    public JuniorDeveloper(int id, String name, long salary) {
        super(id, name);
        this.salary = salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Junior Developer started to work");
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + super.getId() + "," +
                "name=" + super.getName() + "," +
                "salary=" + salary + "," +
                '}';
    }
}