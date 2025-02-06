import java.util.Scanner;
class Bmi

{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter heightinch ");
        float  heightinch=sc.nextFloat();
         System.out.println("enter weipound ");
		float weipound=sc.nextFloat();
		float weikilo=weipound*0.45359237f;
		float heimter=heightinch*0.0254f;
		float bmi=weikilo/(heimter*heimter);
		System.out.println("bmi"+bmi);
	}
}
