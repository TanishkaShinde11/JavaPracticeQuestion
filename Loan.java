import java.util.Scanner;

class Loan

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter month:");
		int month=sc.nextInt();
		int year=(month/12);
		int mnt=month%12;
		System.out.println(year+(mnt/10.0));
	}
}
