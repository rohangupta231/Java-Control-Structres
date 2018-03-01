
class HistogramV
{
	public static void main(String dt[])
	{
		int i=1,num=19128,digit=0,temp=num,rev=0,temp1=0;
		while(temp>0)
		{
			digit=temp%10;
			temp=(temp-digit)/10;
			rev=rev*10+digit;
		}	
		//System.out.print(rev);
		for(i=9;i>0;i--)
		{	
			temp1=rev;
			while(temp1>0)
			{
				digit=temp1%10;
				temp1=(temp1-digit)/10;
				if(digit>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			System.out.print("\n");
		}
	}
}