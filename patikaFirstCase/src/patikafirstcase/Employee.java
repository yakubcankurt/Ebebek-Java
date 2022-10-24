/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patikafirstcase;

import  patikafirstcase.Constants;

/**
 *
 * @author yakub cankurt
 */
public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee() {
    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    
    
   public double tax(){
       if(salary < 1000){
           return 0;
       
    }
       else {
           return salary*3/100;
       }
   }
   
   public double bonus(){
       if (workHours < 40){
           return 0;
       }
       else {
           return (workHours-40)*30;
       }
      
   }
   public double totalSalary(){
       double totalSalary = this.salary - tax() + bonus() + raiseSalary();
       
       
       
       return totalSalary;
   }
   
   public double totalSalaryBeforeRaise(){
       double totalBeforeRaiseSalary = this.salary - tax() + bonus();
       
       
       return totalBeforeRaiseSalary ;
   }
   
   public double raiseSalary(){
       double raise = 0;
       if(Constants.CURRENT_YEAR - hireYear < 10){
           
           raise = salary * 5 / 100;
       }
       else if(10 <= Constants.CURRENT_YEAR - hireYear && Constants.CURRENT_YEAR - hireYear < 20){
           
           raise = salary * 10 / 100;
       }else if(20 <= Constants.CURRENT_YEAR - hireYear ){
           
           raise = salary * 15 / 100;
       }
       return raise;
   }
   
   public String toString(){
       String output = "Ad: " + this.name +"\n" + "Maaş : " + this.salary + " \n" + "Çalışma Saati: " + this.workHours + 
               "\n" + "Başlangıç Yılı: " + this.hireYear + "\n" + "Vergi: " + tax() + "\n" + "Bonus :" + bonus() + "\n" + "Maaş artışı: " + 
               raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş: " + totalSalaryBeforeRaise() + "\n" + "Toplam Maaş: " + totalSalary();
       
       
       return output;
       
       
       
   }
    
    
}
