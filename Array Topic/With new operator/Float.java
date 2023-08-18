class Float
{
	public static void main(String[] args)
	{
		float[] arr=new float[5];
		arr[0]=69.1f;
		arr[1]=69.2f;
		arr[2]=69.3f;
		arr[3]=69.4f;
		arr[4]=69.5f;
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}