package demo;

public class Methodoverload {
		int add(int a,int b)
		{
			return a+b;
		}
		float add(float a,float b)
		{
			return a+b;
		}
		public static void main(String []args) {
			Methodoverload m=new Methodoverload();
			System.out.println("addition of 2 num "+m.add(8,9));
			System.out.println("addition of two float num "+m.add(5.0f,9.9f));
		}

	}
