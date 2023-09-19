import java.io.*;
class Student{
    int rollnumber;
    String name;
    float fee;
    Student(int rollnumber,String name,float fee){
        rollnumber=rollnumber;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println("Student details are");
        System.out.println(rollnumber+" "+name+" "+fee+" ");
    }
}
public class ThisDemo{
    public static void main(String args[]){
        Student s1=new Student(4223,"G.Syam",45700);
        Student s2=new Student(4263,"Pavan",145700);
        s1.display();
        s2.display();
    }
}
