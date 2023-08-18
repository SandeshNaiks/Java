class Bike
{
	int cost;
	static String brand="Duke";
	String colour;
	public static void main(String [] args)
	{
		System.out.println(" Brand: "+ brand);
		Bike b1=new Bike();
		b1.cost=15000;
		System.out.println("Cost: "+ b1.cost);
		Bike b2=new Bike();
		b2.colour="Black";
		System.out.println("Colour: "+ b2.colour);
	}
}