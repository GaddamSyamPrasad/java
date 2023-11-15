import java.io.*;
import java.lang.String;
public class StringDemo{
    public static void main(String args[]){
        String s1="java";
        char[] ch={'s','a','s','i'};
        String s2=new String(ch);
        String s3=new String("Example");
        System.out.println("String-1 is "+s1);
        System.out.println("String-2 is "+s2);
        System.out.println("String-3 is "+s3);
    }
}
