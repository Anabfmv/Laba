/**
 * Created by Anastasia on 11.09.2016.
 */
import java.util.Scanner;//импортируем класс

public class CalcMain
 {

    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);//создаем объект класса
            System.out.println("First number");
            int n1 = scanner.nextInt();//считываем целое число и сохранняем переменную
            System.out.println("operation");
            String operation = scanner.next();
            System.out.println("Second number");
            int n2 = scanner.nextInt();
            scanner.close();

            System.out.println("Result:" + Calc.metodCalc(n1, operation, n2));
        }
        catch (ArithmeticException exception)
        {
            System.out.println("/0 - Forbidden");
        }

    }
 }
