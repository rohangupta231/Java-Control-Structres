class Reverse
{
	public static void main(String dt[])
	{
		int num=152324233;
		int temp=0,digit=0,i=0,rev=0;	
		temp=num;
		/*for(i=0;i<100;i++)
		{
			digit=num%10;
			if(digit==0)
			{
				break;
			}
			num=num/10;
			rev=rev*10+digit;
			
		}*/
		while(temp>0)
		{
			digit=temp%10;
			temp=(temp-digit)/10;
			rev=rev*10+digit;
			i++;
		}
		System.out.print("Reverse of "+num+" is "+rev);
	}
}