import java.io.*;
class Bike2{
    final void run(){
        System.out.println("Bike is running");
    }
}
public class Honda extends Bike2{
    void run(){
        System.out.println("Honda runs at 120 kmph");
    }
    public static void main(String args[]){
        Honda h=new Honda();
        h.run();
    }
}
