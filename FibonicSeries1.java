class FibonicSeries1
{
	public static void main(String dt[])
	{
		int a=21,FT=0,ST=1,NT=1,i=0;
		System.out.print("0 ");
		while(NT<=a)
		{
			
			System.out.print(NT+" ");
			NT=ST+FT;
			FT=ST;
			ST=NT;
		}
	}
}