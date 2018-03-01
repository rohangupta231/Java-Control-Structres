class HistogramWithSpace
{
	public static void main(String dt[])
	{
		int i=1,num=123123,digit=0,temp=num,rev=0,temp1=0,count=0,j=0;
		while(temp>0)
		{
			digit=temp%10;
			temp=(temp-digit)/10;
			rev=rev*10+digit;
			count++;
		}	
		temp1=rev;
		while(temp1>0)
		{
			digit=temp1%10;
			temp=(temp1-digit)/10;
			temp1=temp1/10;
			for(j=count-digit;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(i=1;i<=digit;i++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}