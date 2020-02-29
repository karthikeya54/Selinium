package first;

//1 Mthod overloading -  In Method overloading inheritance is not required/involved...
//2. Method having the same name with different arguments is called method Overloading...
//3. It Occurs in One/Same Class

/*
class MethodOverloading 
{
public static void main(String[] args)
{
float g;
	
	
	mul(1,2,3,4);
	mul(1,2,3);
	mul(1,2);
	mul(1);
	
}
protected static void mul(int i,int j,int k,int f)
{
	System.out.println(i*j*k*f);
}

public static void mul(int i,int j,int k)
{
	System.out.println(i*j*k);
}

 public static int mul(int i,int j)
{
	System.out.println(i*j);
	
}

public static void mul(int i)
{
	System.out.println(i);
}

}


*/


/*

//1. Inheritance is involved in Mthod OverRiding...
//2. Method of SubClass having Same name as that of SuperClass, Overrides the methods of SuperClass then its called MethodOverRiding.
//3. It Occurs between Two Classes, i.e., Super class and a Sub class...
 
public class MethodOverloading {

	public static void main(String args[])
	{
		
		Two t=new Two();
		t.canBeChanged();
		
	}
}


class One
{
	 void canBeChanged(int i,int j)
	{
		System.out.println("This is parent One class, canBeChanged method ");
	}
}

class Two extends One
{
	void kintu()
	{
		System.out.println("Normal method");
	}
	
	 void  canBeChanged()
	{
		System.out.println("This is Child class Now its changed, Its overriding the method");
		
		
	}
}

*/


/*
//4.Any Accessspecifier can be changed in MethodOverLoading

class MethodOverloading 
{
public static void main(String[] args)
{

	
	
	mul(1,2,3,4);
	mul(1,2,3);
	mul(1,2);
	mul(1);
	
}
public static void mul(int i,int j,int k,int f)
{
	System.out.println(i*j*k*f);
}

private static void mul(int i,int j,int k)
{
	System.out.println(i*j*k);
}

  static void mul(int i,int j)
{
	System.out.println(i*j);
	
}

protected static void mul(int i)
{
	System.out.println(i);
}

}

*/



//4. Any Accesspecifier can be changed but according to this rule we can follow private < default < protected < public
/*
public class MethodOverloading {

	public static void main(String args[])
	{
		
		Two t=new Two();
		t.canBeChanged();
		
	}
}


 class One
{
	 protected  void canBeChanged()  //case -1:default accesspecifier is higher capacity than protected, so we wont get error
	{
		System.out.println("This is parent One class, canBeChanged method ");
	}
}

class Two extends One
{
	void kintu()
	{
		System.out.println("Normal method");
	}
	
		 void  canBeChanged()   //case -1:default accesspecifier is higher capacity than protected, so we wont get error
	{
		System.out.println("This is Child class Now its changed, Its overriding the method");
		
		
	}
}


//case -2: Keep for super class - protected and child class is default we will get error 

// Its According to the Priority -  private < default < protected < public


*/



/*

//5. Static methods can be Overloaded which means a class can have more than one static method of same name...

class MethodOverloading 
{
public static void main(String[] args)
{

	
	
	mul(1,2,3,4);
	mul(1,2,3);
	mul(1,2);
	mul(1);
	
}
public static void mul(int i,int j,int k,int f)
{
	System.out.println(i*j*k*f);
}

private static void mul(int i,int j,int k)
{
	System.out.println(i*j*k);
}

  static void mul(int i,int j)
{
	System.out.println(i*j);
	
}

protected static void mul(int i)
{
	System.out.println(i);
}

}

*/


/*
//5. In Method OverRiding - parent Class (static / non-static) ---> we cant modify to (non-static / static) methods...
//Static methods cannot be Overriden, even if you declare a same static method in child class it has nothing to do with the same method of parent class.


public class MethodOverloading {

	public static void main(String args[])
	{
		
		Two t=new Two();
		t.canBeChanged();
		
	}
}


class One
{
	   void canBeChanged()  
	{
		System.out.println("This is parent One class, canBeChanged method ");
	}
}

class Two extends One
{
	void kintu()
	{
		System.out.println("Normal method");
	}
	
	static	 void  canBeChanged()   //We cannot OverRide a non-static method with Static method... (or) static to--> non-static
	{
		System.out.println("This is Child class Now its changed, Its overriding the method");
		
		
	}
}


*/








/*
//6 - Mthod overloading

//6. ReturnType May or May Not be Changed in Method OverLoading

class MethodOverloading 
{
public static void main(String[] args)
{
float g;
	
	
	mul(1,2,3,4);
	mul(1,2,3);
	g=mul(1,2);
	System.out.println("g value is "+g);   //Here value we get is float value//return type may or may not be changed no problem
	mul(1);
	
}
protected static void mul(int i,int j,int k,int f)
{
	System.out.println(i*j*k*f);
}

public static void mul(int i,int j,int k)
{
	System.out.println(i*j*k);
}

 static int mul(int i,int j)   //return type is int
{
	int k=i*j;
	return k; 
}

public static void mul(int i)
{
	System.out.println(i);
}

}

*/


/*

//6. Return Type must be same in super class method and sub class method - Method OverRiding

public class MethodOverloading {

	public static void main(String args[])
	{
		int o;
		Two t=new Two();
		o=t.canBeChanged(10,20);
		System.out.println("o value is "+o);
	}
}


class One
{
	 void canBeChanged(int i,int j)
	{
		System.out.println("This is parent One class, canBeChanged method ");
		return 0;
	}
}

class Two extends One
{
	void kintu()
	{
		System.out.println("Normal method");
	}
	
	 int  canBeChanged(int i,int j)
	{
		System.out.println("This is Child class Now its changed, Its overriding the method");
		int l=i*j;
		return l;
	}
}

*/









