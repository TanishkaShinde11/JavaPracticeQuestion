class Narrowing 
{
	public static void main(String[] args) 
	{
		System.out.println("double Narrowing :"); 
		double d=8.9;
		byte b=(byte) d;
		short s= (short) d;
		char c=(char) d;
		int i= (int) d;
		long l=(long)d;
		float f=(float)d;
		
		System.out.println("byte :"+b);
	    System.out.println("short : "+s);
		 System.out.println("char : "+c); 
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double  :"+d);

         System.out.println();
		
        System.out.println("float Narrowing :"); 
		 f=9.87f;
		 b=(byte)f;
		 s= (short) f;
		 c=(char) f;
		 i= (int) f;
		 l=(long)f;
		 System.out.println("byte :"+b);
		System.out.println("short : "+s);
	     System.out.println("char : "+c); 
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		
		 
		 System.out.println();
		 System.out.println("long Narrowing :");
		 l=9987l;
          b=(byte)l;
		 s= (short) l;
		 c=(char) l;
		 i= (int) l;
       		 System.out.println("byte :"+b);
		System.out.println("short : "+s);
		System.out.println("char : "+c);
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		
		
		
		System.out.println();
		 System.out.println("int Narrowing :"); 
		 i=99;
		 b=(byte)i;
		 s= (short) i;
		 c=(char) i;
		 System.out.println("byte :"+b);
		System.out.println("short : "+s);
		System.out.println("char : "+c);
		System.out.println("int :"+i);

		
		
         System.out.println();
		 System.out.println("char Narrowing :"); 
		 c='o';
		  b=(byte) 'o';
		 s= (short) 'o';
		 System.out.println("byte :"+b);
		System.out.println("short : "+s);
		System.out.println("char : "+c);
   
        System.out.println();
        System.out.println("short Narrowing :");
        s=9;
		b=(byte) s;
		 System.out.println("byte :"+b);
		System.out.println("short : "+s);


	   
	}
}
