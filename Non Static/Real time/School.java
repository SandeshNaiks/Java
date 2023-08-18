class School
{
	static String school_name="Jspiders";
	       String grade;
	int strength;
	public static void main(String [] args)
	{
		System.out.println(" School name: "+ school_name);
		School s1=new School();
		s1.grade="A+";
		System.out.println("Grade: "+ s1.grade);
		School s2=new School();
		s2.strength=699;
		System.out.println("Strength: "+ s2.strength);
	}
}