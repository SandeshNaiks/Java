class Employee
{
	int id;
	int sal;
	char grade;
	Employee(int a,int b,char c)
	{
		id=a;
		sal=b;
		grade=c;
	}
		public static void main(String [] args)
	{
			Employee c=new Employee(101,690000,'A');
			System.out.println(c.id);
			System.out.println(c.sal);
			System.out.println(c.grade);
	}
}