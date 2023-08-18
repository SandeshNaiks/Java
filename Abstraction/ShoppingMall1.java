interface ShoppingMall
{
	void Shopping();
}
class Clothes implements ShoppingMall
{
	public void Shopping()
	{
		System.out.println("Clothes");
	}
}
class Food implements ShoppingMall
{
	public void Shopping()
	{
		System.out.println("Food");
	}
}
class Movie implements ShoppingMall
{
	public void Shopping()
	{
		System.out.println("Movie Tickets");
	}
}
class Cusomer
{
	static void purchase(ShoppingMall s1)
	{
		s1.Shopping();
	}
}
class ShoppingMall1
{
	public static void main(String[] arg)
	{
		Clothes c1=new Clothes();
		Food f1=new Food();
		Movie m1=new Movie();
		Cusomer.purchase(c1);
		Cusomer.purchase(f1);
		Cusomer.purchase(m1);
	}
}