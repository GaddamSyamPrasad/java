import java.io.*;
import java.util.*;
public class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        System.out.println("Enter start: ");
        int a=sc.nextInt();
        for(int i=a;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
