package demo;

import java.util.Scanner;

public class assign2 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter length of the square :");
	int l=sc.nextInt();
	int area=l*l;
	int perimeter=4*l;
	System.out.println("area of square : " +area+" perimetre of square : "+perimeter);
	System.out.println(" breadth of rectangle ");
	int b=sc.nextInt();
	int pr=2*l+2*b;
	int ar=l*b;
	System.out.println("area of rectangle : " +ar+" perimeter of rectanglae "+pr);
}
}
