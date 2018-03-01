class FibonicSeries
{
	public static void main(String dt[])
	{
		int n=7,FT=0,ST=1,i=0;
		int NT=0;
		System.out.print("0 ");
		System.out.print("1 ");
		for(i=0;i<n;i++)
		{
			NT=ST+FT;
			FT=ST;
			ST=NT;
			System.out.print(NT+" ");
		}
	}
}