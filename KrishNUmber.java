class KrishNUmber
{
	public static void main(String[] args) 
	{
		int num=165;
		int sum=0;
		for(int i=num;i>0;i/=10){
			int rem=num%10;
			
			{
			int fact =1;
			for(int j = rem;j>=1;j--){
				fact *= j;
			}
			sum += fact ;
			

			}

			num/=10;
		

	}
		System.out.println(sum);
}

}