class Laptop
{
	int cost;
	String model;
	String colour;
	Laptop(int cost,String model,String colour)
	{
		this.cost=cost;
		this.model=model;
		this.colour=colour;
	}
	public String toString()
	{
		return this.cost+""+model+""+colour;
	}
	public static void main(String[] args)
	{
		Laptop l1=new Laptop(690000,"Lenovo","Black");
		System.out.println(l1);
	}
}