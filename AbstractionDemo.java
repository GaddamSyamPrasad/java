import java.io.*;
abstract class Animal{
    public abstract void AnimalSound();
    public void Sleep(){
        System.out.println("zzzzzzzzzzzzz");
    }
}
class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("Dog sounds Bow-Bow");
    }
}
public class AbstractionDemo{
    public static void main(String[] args){
        Dog d=new Dog();
        d.AnimalSound();
        d.Sleep();
    }
}
