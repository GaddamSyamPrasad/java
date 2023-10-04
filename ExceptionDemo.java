import java.io.*;
public class ExceptionDemo{
    public static void main(String args[]){
        int a[];
        a[]=new int{11,22,33,44,55};
        System.out.println("The array elements are ");
        for(int i=0;i<10;i++){
            System.out.println(a[i]+" ");
        }
    }
}
