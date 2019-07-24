import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your first number:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input your second number");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Please choose an operation:");
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.printf("The result is: %.2f", a + b);
        }
        if (operation.equals("-")) {
            System.out.printf("The result is: %.2f", a - b);
        }
        if (operation.equals("*")) {
            System.out.printf("The result is: %.2f", a * b);
        }
        if (operation.equals("/")) {
            System.out.printf("The resulst is: %.2f", a / b);
        }
        if (operation.equals("%")) {
            System.out.printf("The result is: %.2f", a % b);
        }
    }
}
