class Palindrome
{
	public static void main(String dt[])
	{
		int num=3443,temp=num,rev=0,digit=0;
		while(temp>0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp=(temp-digit)/10;
		}
		if(num==rev)
		{
			System.out.print(rev+" It is a palindrome number");
		}
	}
}