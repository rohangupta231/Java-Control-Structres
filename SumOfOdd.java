class SumOfOdd
{
	public static void main(String dt[])
	{
		int a=7,i=1,sum=0,j=0;
		while(j<=a)
		{
			if(i%2==1)
			{
				sum=sum+i;
				j++;
				System.out.print("\n"+sum);
			}
		i++;
		}
	}
}