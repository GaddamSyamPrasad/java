import java.io.*;
import java.lang.*;
public class StringBufferDemo{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("hello");
        sb.append("Java");
        System.out.println("String is "+sb);
        StringBuffer sb1=new StringBuffer("hello");
        sb1.insert(1,"java");
        System.out.println("String is "+sb1);
        StringBuffer sb2=new StringBuffer("hello");
        sb2.replace(1,3,"java");
        System.out.println("String is "+sb2);
        StringBuffer sb3=new StringBuffer("hello");
        sb3.delete(1,3);
        System.out.println("String is "+sb3);
        StringBuffer sb4=new StringBuffer("hello");
        sb4.reverse();
        System.out.println("String is "+sb4);
    }
}
