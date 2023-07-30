package com.mycompany.q2;

public class Q2 {

    public static void main(String[] args) {
        /*Employee e1=new Employee();
        //without constructor
             e1.setEmpName("Amal");
             e1.setAge(20);
             e1.setSalary(50000.00);
             System.out.println("empname "+e1.getEmpName());
             System.out.println("age "+e1.getAge());
             System.out.println("salary "+e1.getSalary());

           //with constructor
           Employee e1=new Employee("Kamal",22, 80000.00);

             System.out.println("empname "+e1.getEmpName());
             System.out.println("age "+e1.getAge());
             System.out.println("salary "+e1.getSalary());*/

        Salary e2 = new Salary("Nimal", 23, 20000.00, 10000.00);

        System.out.println("Employee Name :" + e2.getEmpname());
        System.out.println("Employee Age :" + e2.getEmpage());
        System.out.println("Employee Basic Salary :" + e2.getBasicsalary());
        System.out.println("Employee Bonus :" + e2.getBonus());
        System.out.println("Employee Salary :" + e2.calSalary());
    }
}
