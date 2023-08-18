class Triangle
{
    void area(int b,int h)
	{
	double result=0.5*b*h;
	System.out.println("The area of triangle is "+result);
}
public static void main(String[] args)
{
	Triangle t=new Triangle();
	t.area(5,10);
	}
}