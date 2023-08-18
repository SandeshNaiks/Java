class School
{
	String name;
	char grade;
	int strength;
	School(String a,char b,int c)
	{
		name=a;
		grade=b;
		strength=c;
	}
		public static void main(String [] args)
	{
			School c=new School("Jspiders",'A',690);
			System.out.println(c.name);
			System.out.println(c.grade);
			System.out.println(c.strength);
	}
}