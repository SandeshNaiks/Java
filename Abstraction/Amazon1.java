interface Amazon
{
	void order();
}
class Groceries implements Amazon
{
	public void order()
	{
		System.out.println("Buying Rice and Sugar");
	}
}
class Footwear implements Amazon
{
	public void order()
	{
		System.out.println("Buying Shoes and Slippers");
	}
}
class Electronics implements Amazon
{
	public void order()
	{
		System.out.println("Buying Phone and Speaker");
	}
}
class Customer
{
	static void buy(Amazon a1)
	{
		a1.order();
	}
}
class Amazon1
{
	public static void main(String[] arg)
	{
		Groceries g1=new Groceries();
		Footwear f1=new Footwear();
		Electronics e1=new Electronics();
		Customer.buy(g1);
		Customer.buy(f1);
		Customer.buy(e1);
	}
}