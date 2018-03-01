class TrianglePyramidWithSpace
{
	public static void main(String dt[])
	{
		int i=1,j=1,k=1,a=4;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}