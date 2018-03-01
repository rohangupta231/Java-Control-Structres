class PrimeNumberPyramid
{
	public static void main(String dt[])
	{	
		int a=10,i=1,n=2,j=0,k=1,l=2,m=1,count=0;
		while(i<=a)
		{
			for(j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			m=1;
			while((k<=(a*(a+1)/2))&&(m<=i))
			{
				count=0;
				l=2;
				while(l<=n/2)
				{
					if(n%l==0)
					{
						count++;
					}
					l++;
				}
				if(count==0)
				{
					System.out.print(" "+n);
					k++;
					m++;
				}
				n++;
			}
			System.out.print("\n");
			i++;
		}
		
	}
}