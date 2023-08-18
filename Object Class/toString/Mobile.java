class Mobile
{
	int cost;
	String name;
	String colour;
	Mobile(int cost,String name,String colour)
	{
		this.cost=cost;
		this.name=name;
		this.colour=colour;
	}
	public String toString()
	{
		return this.cost+""+name+""+colour;
	}
	public static void main(String[] args)
	{
		Mobile m1=new Mobile(69000,"oneplus","Black");
		System.out.println(m1);
	}
}