import java.io.*;
class Employee{
    float salary=40000;
}
public class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is "+p.salary);
        System.out.println("Programmer Bonus is "+p.bonus);
        float totalSalary=p.salary+p.bonus;
        System.out.println("Total Salary is "+totalSalary);
    }
}
