import java.io.*;
import java.lang.*;
public class StringBuilderDemo{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("hello");
        sb.append("Java");
        System.out.println("String is "+sb);
        StringBuilder sb1=new StringBuilder("hello");
        sb1.insert(1,"java");
        System.out.println("String is "+sb1);
        StringBuilder sb2=new StringBuilder("hello");
        sb2.replace(1,3,"java");
        System.out.println("String is "+sb2);
    }
}
