import java.util.Scanner;
class Prime

{
	public static void main(String[] args) 
	{   
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		System.out.println((num==2||num==3 || num==5)?("num is prime" +num):((num%2==0||num%3==0 || num%5==0)?(num+" is not prime"):(num+"is prime")));
	}
}
