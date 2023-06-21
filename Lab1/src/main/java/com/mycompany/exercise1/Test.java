package com.mycompany.exercise1;
public class Test 
{
    private String name;
    private int age;
    private float salary;
    
    //If we use constructor no need setters
    public Test(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;        
    }
    
    /*public void setname (String name)
    {
        this.name=name;
    }*/
    public String getname()
    {
        return name;
    }
    /*public void setage(int age)
    {
        this.age=age;
    }*/
    public int getage()
    {
        return age;
    }
    /*public void setsalary(float salary)
    {
        this.salary=salary;
    }*/
    public float getsalary()
    {
        return salary;
    }
    
}
