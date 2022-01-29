package demo;

import java.util.Scanner;
public class assign1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter principle amount value :");
	int p=sc.nextInt();
	System.out.println("enter rate of intrest :");
	int r=sc.nextInt();
	System.out.println("enter no of years :");
	int n=sc.nextInt();
	int i=p*r*n/100;
	System.out.println("intrest for given years " + i);
	}
	
}

