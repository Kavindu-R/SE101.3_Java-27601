package com.mycompany.q2;

public class Salary {

    private String empname;
    private int empage;
    private double salary, basicsalary, bonus;

    public Salary(String empname, int empage, double basicsalary, double bonus) {
        this.empname = empname;
        this.empage = empage;
        this.basicsalary = basicsalary;
        this.bonus = bonus;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getEmpname() {
        return empname;
    }

    public int getEmpage() {
        return empage;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double calSalary() {
        return salary = basicsalary + bonus;
    }
}
