import java.io.*;
public class EnumDemo{
    public enum Season{
        SUMMER,WINTER,SPRING,FALL;
    }
    public enum Week{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    public static void main(String args[]){
        System.out.println("The Values of Season are ");
        for(Season s:Season.values()){
            System.out.println(s);
        }
        System.out.println("The Values of Week are ");
        for(Week w:Week.values()){
            System.out.println(w);
        }
    }
}
