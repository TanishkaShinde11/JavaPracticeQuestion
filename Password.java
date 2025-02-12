import java.util.Scanner;
class Password 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		int store =123;
		int sec=5000;
		outerLoop:
			for( ;  ;){
			int attempt=3;
			do
			{
				System.out.println("enter pin");
				int pin=sc.nextInt();
				if(store==pin){
					System.out.println("phone unlock");
					break outerLoop;

			}
			else{
               System.out.println("wrong pin");
			   System.out.println("attempt left"+(attempt-1));
			}
			attempt--;
			}


		 while(attempt>=1);
		 System.out.println("phone disavbles for sec"+(sec/1000));
		 Thread.sleep(sec);
		 sec*=2;
		}
	}
}
