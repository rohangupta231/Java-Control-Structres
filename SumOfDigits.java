class SumOfDigits
{
	public static void main(String dt[])
	{
		int num=123,i=0,digit=0,sum=0,temp=num;
		while(temp>0)
		{
			digit=temp%10;
			sum=sum+digit;
			temp=(temp-digit)/10;
		}
		System.out.print("Sum of Digits :"+sum);
	}
}	