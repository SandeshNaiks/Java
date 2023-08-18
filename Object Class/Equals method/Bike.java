class Bike
{
	int cost;
	String brand;
	String colour;
	Bike(int cost,String brand,String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public boolean equals(Object obj)
	{
		Bike m2=(Bike)obj;
		return this.brand==m2.brand;
	}
	public static void main(String[] args)
	{
		Bike m1=new Bike(69000,"Hero","petrol");
		Bike m2=new Bike(69000,"Suzuki","petrol");
		System.out.println(m1.equals(m2));
	}
}