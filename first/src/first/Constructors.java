package first;

/*

public class Constructors {

	
	
	Constructors()
	{
		System.out.println("Iam a Constructor,Iam calling automatically when ever object is created i will be called");
	}
	
	public static void main(String[] args) {
		Constructors k=new Constructors();
	//	k.Constructors();
		
	}

}

*/



/*

//Working of Normal Constructor

class Constructors
{
	int k,l;
	Constructors(int k,int l)
	{
		this.k=k;
		this.l=l;
		 
		
	}
	void Result()
	{
	System.out.println("local k value is "+k +"local l value is"+l); //Those k and l values are out of scope,So we use this keyword this.k=k;
	}
	
	public static void main(String[] args)
	{
		Constructors c=new Constructors(45,99);
		c.Result();
		Constructors c2=new Constructors(445,399);
		c2.Result();
	}
}


*/

/*
//Constructor Overloading

public class Constructors {

	
	public static void main(String[] args) {
		
		Constructors a=new Constructors("deva Rajan","Prudhvi");
		Constructors k=new Constructors(1);
		Constructors d=new Constructors(1,3);
		
		Constructors f=new Constructors(1.45f,56.45f,767.4f);
		Constructors dd=new Constructors(4,455.45f,"karthik");
	}
	
	Constructors(int q)
	{
		int a;
		System.out.println("this is constructor overloading with one argument"+q);
	}
	
	
	
	Constructors(String q,String d)
	{
		System.out.println("string value is "+q+"string si "+d);
	}
	
	Constructors(int i,int s)
	{
		System.out.println("this is constructor overloading with 2 argument"+i +" " +s);
	}
	
	Constructors(float z,float x,float c)
	{
		System.out.println("this is constructor overloading with 3 argument"+z +" " +x +" " +c);
	}
	
	Constructors(int c,float s,String q)
	{
		System.out.println("c vlaue is "+c+"string value is "+q+"float value is"+s);
	}
	
}


*/


/*

//Constructor Overloading:  The process of specifying multiple constructors with different signature is called as constructor overloading.


class Constructors  {
       int length, breadth;
       Constructors()  
       {
	length = breadth = 3;
       }
       Constructors(int x)  {
	length = breadth = x;
        }
       Constructors(int length, int breadth)  {
	this.length = length;
	this.breadth = breadth;
        }
        void area()  
        {
	System.out.println("area : "+(length * breadth));
         }
         public static void main (String[]  args)   {
        	 Constructors r1 = new Constructors();
	r1. area();
	Constructors r2 = new Constructors(4);
	r2. area();
	Constructors r3 = new Constructors(5,6);
         }
}

*/

/*

Q) Why should implement constructor over loading
A) We implement constructor overloading to provide flexibility to the user so that, 
the user can create an object in different ways by passing different values.

Note: In any class, if we are specifying a parameterized constructor then we are recommended
 to specify a zero parameterized constructor whether required or not.

•	Constructor overloading can be implemented only in a single class, it can't be implemented in
 		two different classes even if they have IS-A relationship.
•	The concept of overriding is possible only there is a concept of Inheritance. 
 	The constructors of a class can't be inherited into another class and therefore constructor overriding is not possible.


*/










