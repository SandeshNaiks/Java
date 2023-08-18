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
	public boolean equals(Object obj)
	{
		Home m2=(Home)obj;
		return this.cost==m2.cost;
	}
	public static void main(String[] args)
	{
		Home m1=new Home(6900000,"V Nilaya","White");
		Home m2=new Home(6900000,"S Nilaya","White");
		System.out.println(m1.equals(m2));
	}
}