class CondOperator
{
	public static void main(String[] args) 
	{
		int a=22;
		int b= 7;
		int c=80;
		int larg=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(larg);
}
}