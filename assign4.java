package demo;

import java.util.Scanner;

public class assign4 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%5==0)
		{
			System.out.println(" given "+a+" number is divisible by 5" );
			
		}
		else
		{
			System.out.println("given "+a+"number is not divisible by 5 ");
		}
	}

}
