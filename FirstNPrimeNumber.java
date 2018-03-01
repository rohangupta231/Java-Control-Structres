class FirstNPrimeNumber
{
	public static void main(String dt[])
	{
		int num=20,i=2,j=2,k=2,count=0;
		while(i<num)
		{	
			count=0;
			k=2;
			while(k<=j/2)
			{
				if(j%k==0)
				{
					count++;
				}
				k++;
			}
			if(count==0)
			{
				System.out.print("\n"+j);
				i++;
			}
			j++;
		}
	}
}