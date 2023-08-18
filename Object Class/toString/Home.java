class Home
{
	int cost;
	String name;
	String colour;
	Home(int cost,String name,String colour)
	{
		this.cost=cost;
		this.name=name;
		this.colour=colour;
	}
	public String toString()
	{
		return this.cost+" "+name+" "+colour;
	}
	public static void main(String[] args)
	{
		Home h1=new Home(69000000,"Nilaya","white");
		System.out.println(h1);
	}
}