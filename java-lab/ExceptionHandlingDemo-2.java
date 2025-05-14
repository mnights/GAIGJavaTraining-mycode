public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }
}

