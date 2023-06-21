package com.mycompany.lab2;
public class Monster extends Item
{
    private String item1,item2;
    
    public void setData(String i1,String i2)
    {
        item1=i1;
        item2=i2;
    }
    public void diplayData()
    {
        System.out.println("Your item is "+item1);
        System.out.println("Your item is "+item2);
    }
}
