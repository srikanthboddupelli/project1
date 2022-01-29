package demo;

public class methodcalling {
	public void print()
    {
        System.out.println("Method without return type and without Para");
    }
    
    //method returning nothing with 1 Parameter
    public String display(String name)
    {
        System.out.println("My Name is "+name);
		return name;
    }
    
    //method with return type and parameters
    public int cube(int n)
    {
        return n*n*n;
    }
    
    //method return string and with 2 Parameters
    public String fullName(String fname,String lname)
    {
        return fname+" "+lname;
    }
    public static void main(String []args) {
    	methodcalling obj=new methodcalling();
    	obj.print();
    	obj.display("srikanth");
    	int n=obj.cube(8);
    	String name=obj.fullName("manaswi","hostel");
    	System.out.println("full name "+name);
    	
    }
}
