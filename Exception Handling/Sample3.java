public class Sample3
{
    public static void main(String[] args) {
        System.out.println("**Main Starts**");
        try {
            int i=14/0;
            System.out.println("Hi");
            
        } 
        catch (ArithmeticException e) {
          System.out.println("Handled");
        
        }
        System.out.println("***Main Ends");
        
    }
}