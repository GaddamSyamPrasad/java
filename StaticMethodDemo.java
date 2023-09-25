import java.io.*;
class Student{
    int rollno;
    String name;
    static String college="SITE";
    static void ChangeCollege(){
        college="SASI";
    }
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class StaticMethodDemo{
    public static void main(String args[]){
        Student s1=new Student(4223,"SYAM");
        Student s2=new Student(4208,"SAI");
        System.out.println("Student details are ");
        s1.display();
        Student.ChangeCollege();
        s2.display();
    }
}
