package com.s14d1.positions;

import com.s14d1.positions.Employee;

public class HRManager extends Employee {
    private long salary;

    public HRManager(int id, String name, long salary) {
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
        System.out.println("HR Manager started to work");
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
