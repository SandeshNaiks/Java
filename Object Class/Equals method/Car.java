class Car
{
	int cost;
	String brand;
	String type;
	Car(int cost,String brand,String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public boolean equals(Object obj)
	{
		Car m2=(Car)obj;
		return this.cost==m2.cost;
	}
	public static void main(String[] args)
	{
		Car m1=new Car(6900000,"Supra","petrol");
		Car m2=new Car(6900000,"GTR","petrol");
		System.out.println(m1.equals(m2));
	}
}