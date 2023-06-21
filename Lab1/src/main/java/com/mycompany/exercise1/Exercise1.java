package com.mycompany.exercise1;
public class Exercise1 
{
    public static void main(String[] args)
    {
       Test t1 = new Test("Amal",20, (float) 12000.2);
       /*t1.setname("Amal");
       t1.setage(23);
       t1.setsalary(25000.00f);*/
       
        System.out.println("Name is "+t1.getname());
        System.out.println("Age is "+t1.getage());
        System.out.println("Salary is "+t1.getsalary());
        
    }
}
