import java.util.Scanner;

class Minitues 
{
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Mintutes : ");
		float pound =sc.nextFloat();
		float kilo=0.454f;
		float ans=pound * kilo;
		System.out.println("ans : "+ans);


		
	}
}
