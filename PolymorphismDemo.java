import java.io.*;
import java.util.*;
class Animal {
    public void Animalsound(){
        System.out.println("an animal can make sounds");
    }
}
class Cow extends Animal{
    public void Animalsound(){
        System.out.println("A cow sounds 'mao");
    }
}
        class Cat extends Animal{
            public void Animalsound(){
                System.out.println("A cat sounds'meowh ");
            }
        }
public class PolymorphismDemo{
     public static void main(String args[]){
                Animal an = new Animal();
                Animal mycow = new Cow();
                Animal mycat = new Cat();
                an.Animalsound();
                mycow.Animalsound();
                mycat.Animalsound();
      }
}
