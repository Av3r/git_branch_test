import java.util.Scanner;

/**
 * Created by Damia on 19.06.2019.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void calculate() {
        Integer x, y;
        System.out.println("Type first number: ");
        x = scanner.nextInt();
        System.out.println("Type second number: ");
        y = scanner.nextInt();
        System.out.println("Sum: " + Calculator.add(x, y));
        System.out.println("Subtract: " + Calculator.subtract(x, y));
        System.out.println("Multiply: " + Calculator.multiply(x, y));
        System.out.println("Divide: " + Calculator.divide(x, y));
    }
    public static void main(String[] args) {
        calculate();
    }
}
