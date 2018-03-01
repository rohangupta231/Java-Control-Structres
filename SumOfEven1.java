class SumOfEven1
{
	public static void main(String dt[])
	{
		int a=8,i=1,sum=0;
		while(i<=a)
		{
			if(i%2==0)
			{
					sum=sum+i;
					System.out.print("\n"+sum);
			}
			i++;
		}
	}
}	