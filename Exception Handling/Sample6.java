public class Sample6
{
    public static void main(String[] args) {
        System.out.println("**Main Starts**");
        try {
            int i=14/0;
            
        } 
        catch (ArithmeticException e) {
            int[] arr = {10,20,30};
            try{
               System.out.println(arr[9]);
            }
            catch(ArrayIndexOutOfBoundsException e1){
                 System.out.println("Handled");
            }
        
        }
        System.out.println("**Main Ends**");
        
    }
}