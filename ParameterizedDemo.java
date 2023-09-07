import java.io.*;
import java.lang.*;
 class Rectangle{
     int l,b,a;
    Rectangle(int l, int b){
     a=l*b;
    }
}
public class ParameterizedDemo{
    public static void main(String a[]){
        Rectangle r1 = new Rectangle(10,6);
        System.out.println("Area of rectangle is "+r1.a);
    }
}
