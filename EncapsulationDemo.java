import java.io.*;
class Student{
    public String Sname;
    private String Sphone;
    public String getSphone(){
    return Sphone;
    }
    public void setSphone(String ph){
        this.Sphone=ph;
    }
}
public class EncapsulationDemo{
    public static void main(String[] args){
        Student s=new Student();
        s.Sname="G.Syam Prasad";
        s.setSphone("6301694834");
        System.out.println("Student name is "+s.Sname);
        System.out.println("Student phone number is "+s.getSphone());
    }
}
