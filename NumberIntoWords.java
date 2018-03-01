class NumberIntoWords
{
	public static void main(String dt[])
	{
		int num=101,digit=0,i=0,temp=num,rev=0,count=0;
		String a="";
		String b="";
		String c="";
		String d="";
		if(num==0)
		{
			System.out.println("Zero");
		}
		while(temp>0)
		{
			System.out.print(temp);
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
			count++;
		}
		switch(count)
		{
			case 4:
			digit=rev%10;
			rev=rev/10;
			switch(digit)
			{
				case 1:
				a="One Thousand";
				break;
				case 2:
				a="Two Thousand";
				break;
				case 3:
				a="Three Thousand";
				break;
				case 4:
				a="Four Thousand";
				break;
				case 5:
				a="Five Thousand";
				break;
				case 6:
				a="Six Thousand";
				break;
				case 7:
				a="Seven Thousand";
				break;
				case 8:
				a="Eight Thousand";
				break;
				default:
				a="Nine Thousand";
				break;
			}
			case 3:
			digit=rev%10;
			rev=rev/10;
			switch(digit) 		
			{
				case 1:
				b="One Hundered";
				break;
				case 2:
				b="Two Hundered";
				break;
				case 3:
				b="Three Hundered";
				break;
				case 4:
				b="Four Hundered";
				break;
				case 5:
				b="Five Hundered";
				break;
				case 6:
				b="Six Hundered";
				break;
				case 7:
				b="Seven Hundered";
				break;
				case 8:
				b="Eight Hundered";
				break;
				case 9:
				b="Nine Hundered";
				break;
				default:
				break;
				
			}
			case 2:
			digit=rev%10;
			rev=rev/10;
			switch(digit)
			{
				case 1:
				digit=rev%10;
				switch(digit)
				{	
					case 0:
					c="Ten.";
					break;
					case 1:
					c="Eleven.";
					break;
					case 2:
					c="Tweleve.";
					break;
					case 3:
					c="Thirteen.";
					break;
					case 4:
					c="Fourteen.";
					break;
					case 5:
					c="Fifteen.";
					break;
					case 6:
					c="Sixteen.";
					break;
					case 7:
					c="Seventeen.";
					break;
					case 8:
					c="Eighteen.";
					break;
					case 9:
					c="Ninteen.";
					break;
					default:
					break;
				}
				break;
				case 2:
				c="Twenty";
				break;
				case 3:
				c="Thirty";
				break;
				case 4:
				c="Fourty";
				break;
				case 5:
				c="Fifty";
				break;
				case 6:
				c="Sixty";
				break;
				case 7:
				c="Seventy";
				break;
				case 8:
				c="Eighty";
				break;
				case 9:
				c="Ninty";
				break;
				default:
				rev=-rev;
				break;
			}
			case 1:
			digit=rev%10;
			rev=rev/10;
			switch(digit)
			{
				case 1:
				d="One.";
				break;
				case 2:
				d="Two.";
				break;
				case 3:
				d="Three.";
				break;
				case 4:
				d="Four.";
				break;
				case 5:
				d="Five.";
				break;
				case 6:
				d="Six.";
				break;
				case 7:
				d="Seven.";
				break;
				case 8:
				d="Eight.";
				break;
				case 9:
				d="Nine.";
				break;
				default:
				break;
			}
		}
		System.out.print(a+" "+b+" "+c+" "+d);
	}
}