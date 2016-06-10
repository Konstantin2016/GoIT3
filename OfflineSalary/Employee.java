package OfflineSalary;


abstract public class Employee {
    String name;
    protected double salary;
  /*  protected double rate = 20;
    double hoursPerMonth = 20.8 * 8;
    public abstract double calcSalary(); //публичный метод
*//*

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
*//*

    public static void main(String[] args) {
        PerHourEmployee emp1 = new PerHourEmployee();
        PerMonthEmployee emp2 = new PerMonthEmployee();
     *//*   emp1.setRate(10);

        PerMonthEmployee emp2 = new PerMonthEmployee();
        emp2.setSalary(200);
*//*
        System.out.println(emp1.calcSalary());
        System.out.println(emp2.calcSalary());
    }
}
*/

public Employee (String name){
this.name = name;}
}