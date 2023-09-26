import java.io.*;
public class Bike1{
    final int SpeedLimit=80;
    void run(){
        SpeedLimit=120;
    }
    public static void main(String args[]){
        Bike1 b=new Bike1();
        b.run();
    }
}
