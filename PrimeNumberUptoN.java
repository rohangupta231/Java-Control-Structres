class PrimeNumberUptoN
{
	public static void main(String dt[])
	{
		int count=0,a=20,i=2,j=2,flag=1,k=0;
		while(i<a)
		{	
			count=0;
			j=2;
			while(j<=i/2)
			{	
				if(i%j==0)
				{
					count++;
				}
				j++;
			}	
			if(count==0)
			{
				System.out.print("\n"+i);
			}
			i++;
		}	
			/*else	
			{
				System.out.print("It is not prime");
				break;
			}*/
	}
}