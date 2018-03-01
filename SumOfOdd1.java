class SumOfOdd1
{
	public static void main(String dt[])
	{
		int a=7,i=1,sum=0;
		while(i<=a)
		{
			if(i%2==1)
			{
				sum=sum+i;
				System.out.print("\n"+sum);
			}
			i++;
		}
	}
}