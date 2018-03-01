class SIBase
{
	protected int l,b;
	public SIBase()
	{
		l=0;
		b=0;
	}
	public SIBase(int s)
	{
		l=b=s;
	}
	public SIBase(int i,int j)
	{
		l=i;
		b=j;
	}
}
class SIDerived extends SIBase
{
	public SIDerived()
	{
		super();
	}
	public SIDerived(int s)
	{
		super(s);
	}
	public SIDerived(int i,int j)
	{
		super(i,j);
	}
	public void area()
	{
		System.out.print("Area= "+l*b);
	}
}
class SIDerived1 extends SIDerived
{
	public int h;
	public SIDerived1()
	{
		super();
		h=0;
	}
	public SIDerived1(int s)
	{
		super(s);
		h=s;
	}	
	public SIDerived1(int i,int j,int k)
	{
		super(i,j);
		h=k;
	}
	public void volume()
	{
		System.out.print("Volume= "+l*b*h);
	}
}
class SIMain
{
	public static void main(String dt[])
	{
		SIDerived obj=new SIDerived(3);
		obj.area();
		SIDerived obj1=new SIDerived(4,5);
		obj1.area();
		SIDerived obj2=new SIDerived();
		obj2.area();
		SIDerived1 obj3=new SIDerived1(3);
		obj3.volume();
		SIDerived1 obj4=new SIDerived1(4,5,2);
		obj4.volume();
		SIDerived1 obj5=new SIDerived1();
		obj5.volume();
	}
}