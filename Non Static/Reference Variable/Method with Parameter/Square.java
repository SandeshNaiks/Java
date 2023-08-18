class Square
{
	void area(int a)
	{
	int result=a*a;
	System.out.println("The area of square is "+result);
}
public static void main(String[] args)
{
	Square s=new Square();
	s.area(69);
	}
}