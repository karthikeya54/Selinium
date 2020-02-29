package first;

/*

class Staticinstanceblocks {

	public static void main(String[] args) {
		{
//			Child c = new Child();
			Child.m1();
			System.out.println("test main");
		}
	}

}

class Parent {
	//instatiation initialization 
	
	// int i;  i=10
	static int i = 10;
	static {
		m1();
		System.out.println("first static block");
	}

	public static void m1() {
		System.out.println(j);
	}

	static int j = 20;

}

class Child extends Parent {
	static int x = 100;
	static {
		m2();
		System.out.println("Derived first static block");
	}

	public static void m2() {
		System.out.println(y);
	}

	static {
		System.out.println("Derived first static block");
	}
	static int y = 200;
}


*/












/*

class Staticinstanceblocks{
	int g=4566;
	{
		kapaul();
		System.out.println("instance block");
	}
	
	
	
	public void kapaul()
	{
		System.out.println("caled from instance block inside");
	}
	
public static void main(String[] args) {
	
	Staticinstanceblocks o=new Staticinstanceblocks();
	System.out.println(o.g);
	
}
}


*/






/*

class Staticinstanceblocks
{

	static int lol=45;
	static {
		method();
		System.out.println("Iam running from static method");
	}
	
	static void method()
	{
		
		System.out.println("this is from static method");
		System.out.println(lol);
	}
	
	public static void main(String[] args) {
		System.err.println("hellooo");
	}
}

*/


/*

//We cant write in static method inner static method... Why?????
class Staticinstanceblocks
{
public static void main(String [] args)
{

static {
kiska();

}
static void kiska()
{
System.out.println("iam from static method");

}

}

*/


/*

// static blocks

class Staticinstanceblocks
{
public static void main(String []f)
{
	
//Son.two();
//Son.one();
	
Son we=new Son();
//we.one();
}
}

class Father
{
static int s=343;
static      
{
one();
}
public static void one()   //Thse are all static methods so no need to create instantiation,directly can call with class.methodname(); 
{
System.out.println("This is one method, belongs to Father Class");
System.out.println("S value is "+s);
System.out.println("r value is "+r);
}
static int r=455;

}


class Son extends Father
{
static double t=45.3434;
static
{
two();
}
public static void two()
{
System.out.println("This is two method, belongs to Son Class");
System.out.println("t value is "+t);
System.out.println("f value is "+f);
}
static float f=222.45f;

}

*/



//Executing Both the static and instance blocks

/*
class Staticinstanceblocks
{
	static {
		System.out.println("static block 1");
	}
	
	{
		System.out.println("Instance BLock 1");
	}
	
	Staticinstanceblocks()
	{
		System.out.println("Sample Zero Constructor");
	}
	
	Staticinstanceblocks(int x)
	{
		System.out.println("Sample one Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Sameple main Method");
		Staticinstanceblocks si=new Staticinstanceblocks();
		Staticinstanceblocks si2=new Staticinstanceblocks(45);
	}
	
	{
		System.out.println("Instance Block 2");
	}
	
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
}


*/





//Executing Both INstance block and Constructor

class Staticinstanceblocks
{
	Staticinstanceblocks()
	{
		System.out.println("Hey iam from Constructor 1 ");
	}
	
	{
		System.out.println("Hey iam from instance block 1"); 
	}
	
	

	public static void main(String[] args) {
		Staticinstanceblocks sib=new Staticinstanceblocks();
		System.out.println(sib);
	}

}



/*
 * When ever the Constructor is there in our class, after object creation automatically specialmethod(constructor) will be called..
 * Anyways we have both Constructor and Instance block, if we have both also, it takes the 1st priority as Instance block,
 *  after then only it will come to the construtor...
 */

































