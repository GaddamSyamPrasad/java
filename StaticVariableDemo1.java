import java.io.*;
class Student{
    int rollno;
    String name;
    static String college="SITE";
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class StaticVariableDemo1{
    public static void main(String args[]){
        Student s1=new Student(223,"Syam");
        Student s2=new Student(260,"Subbu");
        System.out.println("Student details are");
        s1.display();
        s2.display();
    }
}
