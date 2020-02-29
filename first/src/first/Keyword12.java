package first;

/*
 * super keyword: Super is a reference variable that is used to refer immediate parent class object...
 * Uses of Super Keyword:
 	Super() is used to invoke immediate parent class constructors
 	Super is used to invoke immediate parent class method
 	Super is used to refer immediate parent class variable
 * 
 */



/*

//Difference b/w super keyword this keyword....


public class Keyword12 {

	public static void main(String[] args) {
		
		Child kk=new Child();
		kk.m1();
	}

}

class Parent
{
	 String s="Parent Variable";
}

class Child extends Parent
{
	String s="Child Variable";
	
	public void m1()
	{
		System.out.println(s);    //By default Current classs varibale will come as o/p.
		System.out.println(this.s); //Now also curent class variable will come as Output...
		System.out.println(super.s);  //Now super class variable wil come as o/p
	}
	
}

*/


/*
public class Keyword12 {

	public static void main(String[] args) {
		
		Child kk=new Child();
		
	}

}

class Parent
{
	 int f=45;
	 public void parent()
	 {
		 
		 System.out.println("f local parent value is "+f);
		 System.out.println("This is a Parent class ");
	 }
}

class Child extends Parent
{
	
	
	public void child()
	{
	int	f=54;
		
		System.out.println("Value of child is, Iam comming from child"+f);
		System.out.println("Value of parent class is, iam coming from parent, but called from Parent class "+super.f);
		super.parent();
	}
	
	
}

*/



/*
 * This is a reference variable that referes to the current object.
 * this () can be used to invoke current class constructor
 * this keyword=Invoke current class method
 * can be paused as argument in method call
 * Argumentin Constructor call
 * canbe used to return the current class instance...
 * 
 */


/*

class Keyword12
{
	int id;   //id in class A is instance variable,this scope cant go into the method...
	

Keyword12(int id)  // id in A() is local variable,
{
	id=id;          // id=30 will be assigned, but it goes out of the scope it should go to display(),then id will be =0
}

void display()
{
	System.out.println(id); //0
}

public static void main(String[] args) {
	Keyword12 l=new Keyword12(30);
	l.display();
}



}



*/



class Keyword12
{
	int id;   
	

Keyword12(int id)  
{
	this.id=id;       //this.id =30 , So it will be assigned as global variable...
	
	
}

Keyword12(int dola,int roja)
{
	System.out.println(dola+ " " +roja);
}

void display()
{
	System.out.println(id);                        //id variable is out of scope,
}

public static void main(Strings[] args) {
	Keyword12 l=new Keyword12(30);
	l.display();
	Keyword12 r=new Keyword12(43,56);
	r.display();
}



}





