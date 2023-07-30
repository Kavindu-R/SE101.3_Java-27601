package com.mycompany.q2;

public class Employee {

    private String empName;
    private int age;
    private double salary;

    public Employee(String empName, int age, double salary) {
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    //setter method
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //getter method
    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee Age :" + age);
        System.out.println("Salary :" + salary);

    }
}
