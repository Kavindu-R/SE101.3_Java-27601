package com.mycompany.lab2;
public class Item
{
    //protected variable-Parent class and any classes have access 
 protected int location;
 protected String description;
 
 public void Item(int location,String description)
 {
     this.location=location;
     this.description=description;     
 }
 public void Item()
 {
     
 }
 
 public void setLocation(int l)
 {
   this.location=l;  
 }
 public int getLocation()
 {
     return location;
 }
 public void setDescription(String d)
 {
     description=d;
 }
 public String getDescription()
 {
     return description;
 }
}
