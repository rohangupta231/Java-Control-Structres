class FrequencyOfNumber
{
	public static void main(String dt[])
	{
		int num=12312,digit=0,temp=num,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0,flag0=0;
		while(temp>0)
		{
			digit=temp%10;
			switch(digit)
			{
				case 1:
				flag1++;
				break;
				case 2:
				flag2++;
				break;
				case 3:
				flag3++;
				break;
				case 4:
				flag4++;
				break;
				case 5:
				flag5++;
				break;
				case 6:
				flag6++;
				break;
				case 7:
				flag7++;
				break;
				case 8:
				flag8++;
				break;
				case 9:
				flag9++;
				break;
				default:
				flag0++;
				break;
			}
			temp=temp/10;
		}
		System.out.println("Frequency of 0 :"+flag0);
		System.out.println("Frequency of 1 :"+flag1);
		System.out.println("Frequency of 2 :"+flag2);
		System.out.println("Frequency of 3 :"+flag3);
		System.out.println("Frequency of 4 :"+flag4);
		System.out.println("Frequency of 5 :"+flag5);
		System.out.println("Frequency of 6 :"+flag6);
		System.out.println("Frequency of 7 :"+flag7);
		System.out.println("Frequency of 8 :"+flag8);
		System.out.println("Frequency of 9 :"+flag9);
	}
}