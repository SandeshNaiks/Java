class Bike
{
	int cost;
	String model;
	String type;
	Bike(int cost,String model,String type)
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
		Bike b1=new Bike(6900000,"Duke","Petrol");
		System.out.println(b1);
	}
}