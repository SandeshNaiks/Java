class Irctc
{
	static String booking()
	{
		return "booking the tickets";
	}
	static String seat()
	{
		return "seat is selected";
	}
		static String payment()
	{
		return "payment is done";
	}
	static String confirmation()
	{
		return "ticket is confirmed";
	}
	public static void main(String[] args)
	{
		String x=booking();
		System.out.println(x);
		String y=seat();
		System.out.println(y);
		String z=payment();
		System.out.println(z);
		String b=confirmation();
		System.out.println(b);
	}
	static void irctc(String s)
	{
		System.out.println("ticket is booked" +s);
	}
}