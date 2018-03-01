class Pyramid4
{
	public static void main(String dt[])
	{
		int i=1,j=1,a=4,k=1;
		for(i=1;i<=a;i++)
		{
			for(k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(j=a;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}