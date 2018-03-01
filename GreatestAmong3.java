class GreatestAmong3
{
	public static void main(String dt[])
	{
		int a=4,b=3,c=7;
		if(a>b&&a>c)
		{
			System.out.print("Greatest no. is ="+a);
		}
		else if (((a>b)&&(a<c))||((b>a)&&(b<c)))
		{
			System.out.print("Greatest no. is ="+c);
		}
		else
		{
		System.out.print("Greatest no. is ="+b);
		}
	}
}