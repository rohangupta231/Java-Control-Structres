class SevenSegment
{
	public static void main(String dt[])
	{
		int n=4,digit=0,rev=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			rev=rev*10+digit;
		}
		while(rev>0)
		{	
			digit=rev%10;
			rev=rev/10;
			switch(digit)
			{
				case 1:
				System.out.println("  |");
				System.out.println("  |");
				break;
				case 2:
				System.out.println(" _");
				System.out.print(" _");
				System.out.println("|");
				System.out.print("|");
				System.out.println("_");
				break;
				case 3:
				System.out.println(" _");
				System.out.print(" _");
				System.out.println("|");
				System.out.print(" _");
				System.out.println("|");
				break;
				case 4:
				System.out.print("|");
				System.out.print("_");
				System.out.println("|");
				System.out.println("  |");
				break;
				case 5:
				System.out.println(" _");
				System.out.print("|");
				System.out.println("_");
				System.out.print(" _");
				System.out.println("|");
				break;
				case 6:
				System.out.println(" _");
				System.out.print("|");
				System.out.println("_");
				System.out.print("|");
				System.out.print("_");
				System.out.print("|");
				break;
				case 7:
				System.out.println(" _");
				System.out.println("  |");
				System.out.println("  |");
				break;	
				case 8:
				System.out.println(" _");
				System.out.print("|");
				System.out.print("_");
				System.out.println("|");
				System.out.print("|");
				System.out.print("_");
				System.out.println("|");
				break;
				case 9:
				System.out.println(" _");
				System.out.print("|");
				System.out.print("_");
				System.out.println("|");
				System.out.print(" _");
				System.out.println("|");
				break;
				default:
				System.out.println(" _");
				System.out.print("|");
				System.out.println(" |");
				System.out.print("|");
				System.out.print("_");
				System.out.println("|");
			}
			//System.out.println("");
		}	
	}
}