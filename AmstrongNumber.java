class AmstrongNumber
{
	public static void main(String dt[])
	{
		int num=153,digit=0,AM=0,temp=num;
		while(temp>0)
		{
			digit=temp%10;
			AM=AM+digit*digit*digit;
			temp=(temp-digit)/10;
		}
		if(num==AM)
		{
			System.out.print(num+" is Amstrong Number");
		}
		else
		{
			System.out.print("Number is Not Amstrong Number");
		}
	}
}