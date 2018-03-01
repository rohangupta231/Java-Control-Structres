class SumOfEven
{
	public static void main(String dt[])
	{
		int a=8,i=1,sum=0,j=1;
		while(j<=a)
		{
		if(i%2==0)
		{
			sum=sum+i;
			System.out.print(sum+"\n");
			j++;
		}
		i++;
		}
		
	}
}