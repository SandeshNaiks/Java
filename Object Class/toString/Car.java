class Car
{
	int cost;
	String model;
	String type;
	Car(int cost,String model,String type)
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
		Car c1=new Car(6900000,"Supra","Petrol");
		System.out.println(c1);
	}
}