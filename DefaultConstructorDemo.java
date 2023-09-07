import java.io.*;
class Rectangle{
    int l,b,a;
    Rectangle(){
        l=10;
        b=11;
        a=l*b;
    }
}
public class DefaultConstructorDemo{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("Area of Rectangle-1 is "+r1.a);
        System.out.println("Area of Rectangle-2 is "+r2.a);
    }
}
