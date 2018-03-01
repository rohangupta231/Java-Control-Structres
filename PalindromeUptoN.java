class PalindromeUptoN
{
	public static void main(String dt[])
	{
		int num=1000,i=1,temp=0,rev=0,digit=0;
		while(i<num)
		{	
			temp=i;
			rev=0;
			digit=0;
			while(temp>0)
			{	
				digit=temp%10;
				rev=rev*10+digit;
				temp=(temp-digit)/10;
			}
			if(i==rev)
			{
			System.out.print("\n"+i);
			}
			i++;
		}
	}
}