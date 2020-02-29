package first;

/*

class Wrapperclasses{
	
	public static void main(String[] args)
	{
		
		int i=new Integer(455);  //here we are converting object type to primitive type
		System.out.println(i);
				
		Integer ii=new Integer(454);  //here we are converting primitive into objecttype
		System.out.println(ii);
		
		Double k=new Double(44.343);
		System.out.println(k);
		//k.  (Then you can know that its belongs to object type or not)
		
		
		Double kk=new Double("454.34");
		System.out.println(kk);
		

	//	double ww=new Double("fdf"); //It raises numberformatException(becz we are not sending double value
	//	System.out.println(ww);
		
		//Byte b=new Byte(45);
		//System.out.println(b);
		
		
    	 Integer p=new Integer (10);
		Integer c=new Integer (10);
		
		System.out.println(p==c);  //false????????????
		
	    Integer xx=10;
		Integer yy=10;

		System.out.println(xx==yy);
		
		Integer x= Integer. valueOf (10); 
		Integer y= Integer. valueOf (10);

		System.out.println(x==y);
		
		Integer w= 10;
		Integer q=Integer. valueOf (10);
		
		System.out.println(w==q);
		
	}
	
}


*/





/*
 * this is an object oriented programing lang, But some we have primitive datatypes...
 To make java 100% object oriented programing lang we should use wrapper classes.
 
 wrapper clases means converting from primitive data type to object  and object to primitive data type then we use wrapper clases.
 
 
 Primitive    Wrapper Type
 * byte -----> Byte
 * short ----> Short
 * int ------> Integer
 * long -----> Long
 * float ----> Float
 * double ---> Double
 * char -----> Character
 * boolean --> Boolean
 */

/*

public class Wrapperclasses {

	public static void main(String[] args) {
		
		
		//Auto-Boxing - Converting Primitive type to Wrapper object is called Auto-Boxing...
		
		byte n=34;
		
		Byte m=n;     //In new Version we can do autoboxing like this...Directly it converts frm primitive to object type(autoboxing, now compiler will write Integer.valueOf(n) internally)
		
		System.out.println("Converting primitive type to wrapper object type directly -1  "+m);
	
		Byte b=Byte.valueOf(n); //Converting primitive type to Wrapper object Type is known as Auto-Boxing...(Compiler understand like this for autoboxing)
		
		System.out.println("Converting primitive  type to wrapper object compiler way(old style)  "+b);
		 
		
		//Auto-Unboxing - Converting Wrapper object type to Primitive type is called Auto-UnBoxing...
		
		byte bb=b;
		
		System.out.println("Converting object type to primitive type directly -1  "+bb);
		
		byte bbb=b.byteValue();
		
		System.out.println("Converting object type to primitive type Compiler way(old style)  "+bbb);
		
		
		
		
	}

}

*/





/*


public class Wrapperclasses {

	public static void main(String[] args) {
		

		//autoboxing - converting primitives into objects
		
float a=50.0F;      //The datatypes Which are noted in small letters are called primitive datatypes
char c='a';  
boolean d=true;

Float fobj=a;      //The datatypes Which are noted in small letters are called Wrapper Object type.
Character ch=c;  
Boolean bo=d;  


System.out.println("Float object: "+fobj);  
System.out.println("Character object: "+ch);  
System.out.println("Boolean object: "+bo);


//Unboxing - converting objects into primitives

char cha=ch;  
boolean bool=bo; 

System.out.println("Character object: "+cha);  
System.out.println("Boolean object: "+bo);


}
}

*/


public class Wrapperclasses {

	public static void main(Strings[] args) {
		
//		Integer x=new Integer (10);
//		Integer y=new Integer (10);
//
//			System.out.println(x==y);
//			
//			Integer q=10;
//			Integer w=10;
//
//			System.out.println(q==w);
//				
//			
//			
//			Integer xx= Integer. valueOf (10); 
//			Integer yy= Integer. valueOf (10);
//
//				System.out.println(xx==yy);
//				
//				
		
		
				
}
}