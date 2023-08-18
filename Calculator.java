class Calculator
{
	static void add()
	{
		int x=5;
		int y=10;
		int z=x+y;
		System.out.println("the addition of 2 numbers : "+z);
	}
	static void sub()
	{
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println("the subtraction of 2 numbers : "+c);
	}
	static void mul()
	{
		int d=5;
		int e=10;
		int f=d*e;
		System.out.println("the multiplication of 2 numbers : "+f);
	}
	static void div()
	{
		int g=10;
		int h=5;
		int j=g/h;
		System.out.println("the division of 2 numbers : "+j);
	}
	public static void main(String[] args)
	{
		int option=1;
		switch (option)
		{
			case 1:add();
					break;
			case 2:sub();
					break;
			case 3:mul();
					break;
			case 4:div();
					break;
			default :System.out.println("invalid option");
					break;
		}
	}
}