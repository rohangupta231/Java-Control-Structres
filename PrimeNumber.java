class PrimeNumber
{
	public static void main(String dt[])
	{
		int n=3,i,flag=0;
		/*for(i=n;i>1;i--)
		{
			if((n%i==0)&&(i!=1)&&(i!=n))
			{
				flag=1;
				break;
			}
		}*/
		
		for(i=2;i<n/2;i++)
		{
			if((n%i==0))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is composite");
		}
	}
}