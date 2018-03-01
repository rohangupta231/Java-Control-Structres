class FirstNEven
{
	public static void main(String dt[])
	{
		int n=10,i,j=0;	
		for(i=0;i>=0;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				j++;
			}
			if(j==10)
			{
				break;
			}
		}
	}
}