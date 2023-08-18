class Course
{
	String name;
	String university;
	int fees;
	Course(String a,String b,int c)
	{
		name=a;
		university=b;
		fees=c;
	}
		public static void main(String [] args)
	{
			Course c=new Course("BE","VTU",69000);
			System.out.println(c.name);
			System.out.println(c.university);
			System.out.println(c.fees);
	}
}