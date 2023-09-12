import java.util.*;
public class ElseIfExample{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=a+b+c;
		float avg=total/3;
		System.out.println("total marks is"+total);
		if(avg>=75)
		{
		System.out.println("student avg is"+avg+"student passed in distinction");
		}
		else if(avg>=65&&avg<75)
		{
		System.out.println("student avg is"+avg+"student passed in first class");
		}
		else if(avg>=45&&avg<65)
		{
		System.out.println("student avg is"+avg+"student passed in second class");
		}
		else
		{
		System.out.println("student fail");
		}
	}
}	