class Tv
{
	int cost;
	String model;
	String type;
	Tv(int cost,String model,String type)
	{
		this.cost=cost;
		this.model=model;
		this.type=type;
	}
	public String toString()
	{
		return this.cost+""+model+""+type;
	}
	public static void main(String[] args)
	{
		Tv t1=new Tv(6900,"LG","LED");
		System.out.println(t1);
	}
}