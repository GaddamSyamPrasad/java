import java.io.*;
public class Caluclate{
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String args[]){
        int result=Caluclate.cube(5);
        System.out.println("Cube of 5 is "+result);
    }
}
