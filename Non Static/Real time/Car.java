class Car
{
	int cost;
	static String model="Ford";
	static String type;
	public static void main(String [] args)
	{
		System.out.println(" Model of car: "+ model);
		Car c1=new Car();
		c1.cost=2500000;
		System.out.println("Cost of the car: "+ c1.cost);
		Car c2=new Car();
		c2.type="Petrol";
		System.out.println("Type of the car: "+ c2.type);
	}
}