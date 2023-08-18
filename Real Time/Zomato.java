class Zomato
{
	static void order()
	{
	System.out.println("the order is placed");
	}
	static String orderRecieved()
	{
	return "order is recieved";
	}
	static String cooking()
	{
	return "food is preparing";
	}
	static int bill()
	{
	return 569;
	}
	static void reviewDelivery()
	{
	System.out.println("the feedback is positive");
	}
	public static void main(String[] args)
	{
	order();
	String y=orderRecieved();
	System.out.println(y);
	String b=cooking();
	System.out.println(b);
	int amt=bill();
	System.out.println("bill amount paid: "+amt);
	reviewDelivery();
	}
}