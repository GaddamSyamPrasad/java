import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat ");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog can bark ");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog can weep");
    }
}
public class SingleIheritanceDemo1{
    public static void main(String args[]){
        BabyDog B = new BabyDog();
        B.eat();
        B.Bark();
        B.weep();
    }
}
