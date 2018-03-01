class PascalTriangle
{
	public static void main(String dt[])
	{
		int i=0,j=0,k=0,a=15,sum=0,num=1;
		for(i=0;i<a;i++)
		{
			for(j=1;j<a-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				if(k==0||k==i)
				{
					num=1;
				}
				else
				{
					num=num*i/k;
				}
				System.out.print(num+" ");
			}
			System.out.print("\n");
		}
	}
}