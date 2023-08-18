public class Sample7
{
    public static void main(String[] args) {
        System.out.println("**Main Starts**");
        try {
            int i=4/0;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught");
        }
        System.out.println("**Main Ends**");
    }
}