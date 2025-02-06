import java.util.Scanner;
class EVM

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,ss=0,aap=0,mns=0,nota=0;
		System.out.println();
		System.out.println("                   Welcome         ");
		System.out.println("enter population");
		int population=sc.nextInt();
		for(int i=1;i<=population;i++)
		{
			System.out.println("**List of parties**");
			System.out.println("1.BJP");
			System.out.println("2 congress");
			System.out.println("3.Shiv sena");
			System.out.println("4 aap");
			System.out.println("5 mns");
			System.out.println("6.nota");
			int opt =sc.nextInt();
			if(opt>=1 && opt<=6){
				if(opt==1){
					bjp++;
						System.out.println("bjp achhe din");

		}
		if(opt==2){
					cng++;
						System.out.println("cng din");

		}
		if(opt==3){
					ss++;
						System.out.println("ss achhe din");

		}
		if(opt==4){
					aap++;
						System.out.println("app achhe din");

		}
		if(opt==5){
					mns++;
						System.out.println("mns achhe din");

		}
		if(opt==6){
					nota++;
						System.out.println("nota achhe din");

		}
		if(!(opt>=1 && opt<=6)){
			i--;
			
						System.out.println("Invalid option");

		}



	}
	if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
		
						System.out.println("bjp won "+bjp);
	}
	if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
		
						System.out.println("cng won "+cng);
	}
	if(ss>=bjp && ss>=bjp && ss>=aap && ss>=mns && ss>=nota){
		
						System.out.println("ss won "+ss);
	}
     if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota){
		
						System.out.println("app won "+aap);
	}
	if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota){
		
						System.out.println("mns won "+mns);
	}

        }


		}
}
