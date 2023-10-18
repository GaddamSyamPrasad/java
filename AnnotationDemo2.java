class A{
    void in(){
        System.out.println("Inside the method m");
    }
    void n(){
        System.out.println("Inside method n");
    }
}
public class AnnotationDemo2{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }
}
