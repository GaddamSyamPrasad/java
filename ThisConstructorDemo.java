class A{
    A(){
        System.out.println("Inside default constructr");
    }
    A(int x){
        this();
        System.out.println("Parameterized constructor invoked");
        System.out.println("X value is "+x);
    }
}
public class ThisConstructorDemo{
    public static void main(String args[]){
        A a=new A(4223);
    } 
}
