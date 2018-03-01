class MissingNumber
{
	public static void main(String dt[])
	{
		int num=123,i=0,temp=num,digit=3,count=0,rem=0;
		
			
			for(i=0;i<=9;i++)
			{		
				count=0;
				while(temp>0)
				{
					rem=temp%10;
					temp=(temp-rem)/10;
					if(i!=rem)
					{
						count++;
					}
				}										
				if(count==digit)
				{
					System.out.print("\n"+i);
				}
				temp=num;
		}
	}
}