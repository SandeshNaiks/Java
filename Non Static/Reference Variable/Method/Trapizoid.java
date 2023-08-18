class Trapizoid
{
	void area()
	{
	int a=5;
	int b=5;
	int h=10;
	double result=0.5*a+b*h;
	System.out.println("The area of trapizoid is "+result);
}
public static void main(String[] args)
{
	Trapizoid t=new Trapizoid();
	t.area();
	}
}