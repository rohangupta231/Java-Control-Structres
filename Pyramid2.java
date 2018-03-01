class Pyramid2
{
	public static void main(String dt[])
	{
		int i=0,j=0,a=4;
		for(i=0;i<a;i++)
		{
			for(j=a;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}