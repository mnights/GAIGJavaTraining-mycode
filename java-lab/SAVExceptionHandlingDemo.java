public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

