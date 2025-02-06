class  Calculator 
{
	public static void main(String[] args) 
	{      
         Scanner sc =new Scanner(System.in);
			 float num1=sc.nextFlaot();
		 flaot num2=sc.nextFlaot();
		 char op=sc.next().charAt(0);
		 float opt=0;
		opt=(op=='+')?num1+num2:
			opt=(op=='-')?num1-num2:
			opt=(op=='*')?num1*num2:
			opt=(op=='/')?num1/num2:
			opt=(op=='%')?num1%num2:0.00000F;
		String output =num1+" "+op+" " +num2+" = " + opt;
		if(!(opt==0.00000f));
			System.out.println(output);
	}
}
