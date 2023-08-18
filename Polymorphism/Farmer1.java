class Farmer
{
	void grow()
	{
		System.out.println("Some grain");
	}
}
class Ragi extends Farmer
{
	void grow()
	{System.out.println("Growing Ragi");
	}
}
class Maize extends Farmer
{
	void grow()
	{
		System.out.println("Growing Maize");
	}
}
class Rice extends Farmer
{
	void grow()
	{
		System.out.println("Growing Rice");
	}
}
class Rain
{
	static void rainfall(Farmer f1)
	{
		f1.grow();
	}
}
class Farmer1
{
	public static void main(String[] arg)
	{
		Ragi r1=new Ragi();
		Maize m1=new Maize();
		Rice r2=new Rice();
		Rain.rainfall(r1);
		Rain.rainfall(m1);
		Rain.rainfall(r2);
	}
}