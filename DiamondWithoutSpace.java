class DiamondWithoutSpace
{
	public static void main(String dt[])
	{
		int i=1,j=1,k=1,a=7,count=1,flag=0;
		for(i=1;i<=a;i++)
		{
			/*if(i<=a/2)
			{
				j=1;
			}
			else if(i>a/2)
			{
				j=a/2;
			}
			while(j<=(a-i)/2)
			{
				if(i<=a/2)
				{		
					System.out.print(" ");
					j++;
				}	
				else if(i>a/2)
				{
					System.out.print(" ");
					j--;
				}	
			}	
			k=1;
			while(k<=2*i-1)
			{		
				if(i<=a/2+1)
				{	
					System.out.print("*");
					k++;
				}
				else if(i>a/2+1)
				{
					System.out.print("*");
					k--;
				}
			}*/
			for(j=1;j<=a/2-count+1;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*count-1;k++)
			{
				System.out.print("*");
			}
			if(i<=a/2)
			{
				count++;
			}
			else
			{
				count--;
			}
			System.out.print("\n");
		}		
	}	
}