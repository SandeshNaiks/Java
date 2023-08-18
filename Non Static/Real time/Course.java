class Course
{
	String course_name;
	static String university="VTU";
	int exam_cost;
	public static void main(String [] args)
	{
		System.out.println(" University name: "+ university);
		Course c1=new Course();
		c1.course_name="Engineering";
		System.out.println("Course: "+ c1.course_name);
		Course c2=new Course();
		c2.exam_cost=2000;
		System.out.println("cost of exam: "+ c2.exam_cost);
	}
}