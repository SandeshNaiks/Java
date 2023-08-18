public class Sample5
{
    public static void main(String[] args) {
        System.out.println("**Main Starts**");
        try {
            int i=14/2;
            int[] arr = {10,20,30};
            try{
               System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Handled");
            }
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught");
        }
        System.out.println("**Main Ends**");
        
    }
}