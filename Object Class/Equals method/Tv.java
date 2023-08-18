class Tv
{
	int cost;
	String brand;
	String type;
	Tv(int cost,String brand,String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public boolean equals(Object obj)
	{
		Tv m2=(Tv)obj;
		return this.type==m2.type;
	}
	public static void main(String[] args)
	{
		Tv m1=new Tv(6900,"LG","LCD");
		Tv m2=new Tv(6930,"Apple","LED");
		System.out.println(m1.equals(m2));
	}
}