public class Sample4 {
	 public static void main(String[] args) 
	 {
		 System.out.println("main starts");
		 Sample4 h1=null;
		 
		 try {
			 System.out.println(h1.hashCode());
		} catch (Exception e) {
			System.out.println("handled");
		}
		 System.out.println("main ends");
	 }
}