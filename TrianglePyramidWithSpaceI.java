class TrianglePyramidWithSpaceI
{
	public static void main(String dt[])
	{
		int i=1,j=1,k=1,a=4;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(k=a;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}