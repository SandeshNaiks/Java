class Clothes
{
	int cost;
	String brand;
	String size;
	Clothes(int cost,String brand,String size)
	{
		this.cost=cost;
		this.brand=brand;
		this.size=size;
	}
	public String toString()
	{
		return this.cost+" "+brand+" "+size;
	}
	public static void main(String[] args)
	{
		Clothes c1=new Clothes(690,"Polo","X,XL,XXL");
		System.out.println(c1);
	}
}