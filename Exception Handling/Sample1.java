 class Sample1 {
	public static void main(String[] args) 
	 {
		 System.out.println("main starts");
		 int [] arr={2,3,1,8};
		 try {
			 System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println("handled");
		}
		
		 System.out.println("main ends");
	 }
  
}