class Triangle
{
    void area()
	{
	int b=30;
	int h=5;
	double result=0.5*b*h;
	System.out.println("The area of triangle is "+result);
}
public static void main(String[] args)
{
	Triangle t=new Triangle();
	t.area();
	}
}