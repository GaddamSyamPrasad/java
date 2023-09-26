import java.io.*;
final class Bike3{
    void run(){
        System.out.println("Bike is running");
    }
}
public class Honda extends Bike3{
    void run(){
        System.out.println("Honda runs at 120kmph");
    }
    public static void main(String args[]){
        Honda h=new Honda();
        h.run();
    }
}
