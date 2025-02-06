import java.util.Scanner;

class Program 
{
	public static void main(String[] args) 
	{
	  Scanner sc =new Scanner(System.in);
	  int a=3;
	  int b=8;
	  System.out.println("before swapping");
      System.out.println("a:"+ a);
	  System.out.println("b:"+b);
     System.out.println("after swapping");

     int temp=a;
	 a=b;
	 b=temp;
     System.out.println("a:"+ a);
	 System.out.println("b:"+b);

        
	  System.out.println("a:"+ a);
	  System.out.println("b:"+b);

     final double pie=22/7;
	 System.out.println("enter radius");

     int r=sc.nextInt();
	 double area=pie*r*r;
	 System.out.println("area of circle for radius is " + area);

   
	}
}




