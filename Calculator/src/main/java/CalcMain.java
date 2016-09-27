import java.util.Scanner;

public class CalcMain {
    public CalcMain() {
    }

    public static void main(String[] args) {
        try {
            Scanner exception = new Scanner(System.in);
            System.out.println("First number");
            int n1 = exception.nextInt();
            System.out.println("operation");
            String operation = exception.next();
            System.out.println("Second number");
            int n2 = exception.nextInt();
            exception.close();
            System.out.println("Result:" + Calc.metodCalc(n1, operation, n2));
        } catch (ArithmeticException var5) {
            System.out.println("/0 - Forbidden");
        }

    }
}
