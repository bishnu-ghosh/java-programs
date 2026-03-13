public class DivisionDemo {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        sc.close();
    }
}