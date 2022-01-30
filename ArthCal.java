package demo;

import java.util.Scanner;

public class ArthCal {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Arthmetic calculator");
	System.out.println("Enter 1st  number :");
	double a1=sc.nextDouble();
	System.out.println("Enter 2nd number :");
	double a2=sc.nextDouble();
	int s=sc.nextInt();
	if(s==1) {
		System.out.println("Addition :"+(a1+a2));
		
	}
	else if(s==2)
	{
		System.out.println("substraction :"+(a1-a2));
	}
	else if(s==3)
	{
		System.out.println("division :"+(a1/a2));
	
	}
	else if(s==4)
	{
		System.out.println("multiplication :"+(a1*a2));
	}
	else
	{
		System.out.println("enter valid data");
	}
}
}
