package first;


/*

public class Interface {

	public static void main(String[] args) {
		
		Car B=new Benz();
		B.color();
		B.cost();
		Car k=new kwid();
		k.color();
		k.cost();

	}

}

interface Car
{      //members of java interface are public & abstract by default, while implementation also we write public acess specifier...
	abstract void color(); //In interface there all will be abstract methods only,
	void cost();   //withoutspecifying abstract keyword also it automatically recognizes as an abstract method becz we wrote under interface
	
//	public void non()    //So, non-abstract methods are not allowed in interface and interface cant provde implementation of abstract class.
//	{
//		System.out.println("helooo");
//	}
}

 class Benz implements Car
{
public void color()
	{
		System.out.println("benz color is Black");
	}
public void cost()
	{
		System.out.println("This cost is high");
	}
}
 
 class kwid implements Car
{
public void color()
	{
		System.out.println("kwid color is red");
	}
public void cost()
	{
		System.out.println("This cost is low");
	}
}


*/



/*
//Multiple Inheritance one class with more interfaces it supports by keeping implements 

interface On
{
	void k();
	
}

interface Two
{
	void o();
}

class Interface implements On,Two  //one class can implements two interfaces...(or)
{
	public void k()
	{
		System.out.println("this if from k method ");
	}
	
	public void o()
	{
		System.out.println("this is o method ");
	}
	
	public static void main(String[] args) {
		Interface kk=new Interface();
		kk.k();
		kk.o();
	}
}



*/


/*

//multiple inheritance via interface

interface On
{
	void same();
	
}

interface Two
{
	void same();
}

class Interface implements On,Two  //one class can implements two interfaces...(or)
{
	public void same()
	{
		System.out.println("we are having same methods having multiple inheritance");
	}
	
	
	public static void main(String[] args) {
		Interface kk=new Interface();
		kk.same();
	
	}
}



*/


/*

interface Printable
{  
void print();  
}  
interface Showable extends Printable // interface vs interface ---> extends , interface vs class ---> implements
{  
void show();  
}

class Interface implements Showable
{
	public void print()
	{
		System.out.println("this is from print");
	}
	public void show()
	{
		System.out.println("this if from show");
	}
	
	public static void main(String[] args) {
		Interface i=new Interface();
		i.print();
		i.show();
	}
}


*/


/*

//static keyword using in interface concept

interface road
{
	void color();
	static void lights()   //defaultly for interface, method will be public, abstract ...,,, but when i keep static keyword, we can write body also from version java 8 
	{
		System.out.println("The lights are provided night time by gvt");
	}
}

class O implements road
{
public	void color()
	{
		System.out.println("road color is black");
	}
}

class Interface
{
	public static void main(String[] args) {
		road r=new O();
		r.color();
		road.lights(); //this is a static method so, it can only called by classname.methodname,we cant access refvar.methodname();
		
	}
}

*/


/*

interface road
{
	void color();
	default void lights()   //defaultly for interface, method will be public, abstract ...,,, but when i keep default keyword, we can write body also from version java 8 
	{
		System.out.println("The lights are provided night time by gvt");
	}
}

class O implements road
{
public	void color()
	{
		System.out.println("road color is black");
	}
}

class Interface
{
	public static void main(String[] args) {
		road r=new O();
		r.color();
		r.lights(); //this is a default method so, it can only called by refvar.methodname
		
	}
}


*/