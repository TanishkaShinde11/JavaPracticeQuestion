import java.util.Scanner;
class Month

{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
	System.out.println("enter month");
	String month=sc.nextLine();
    String ans=(month=="OCT" || month=="NOV" || month=="DEC" || month=="JAN")?("Winter"):((month=="FEB" || month=="MAR" && month=="APR" && month=="MAY")?():();
	System.out.println(ans);
	}
}
