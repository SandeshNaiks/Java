class Flipkart
{
	static void order()
	{
		System.out.println("order is placed");
	}
	static String payment()
	{
		return "payment is done";
	}
		static String confirmation()
	{
		return "order is confirmed";
	}
	static String delivery()
	{
		return "the product is delivered";
	}
	public static void main(String[] args)
	{
		order();
		String y=payment();
		System.out.println(y);
		String x=confirmation();
		System.out.println(x);
		String z=delivery();
		System.out.println(z);
	}
}