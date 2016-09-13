/**
 * Created by Anastasia on 11.09.2016.
 */

public class Calc
 {
    public static int metodCalc(int a1, String operation, int a2)
    {
        int result=0;
        if(a2 == 0 && operation == "/")
        {
            throw new ArithmeticException();
        }
        else {
            switch (operation) {
                case "+":
                    result = a1 + a2;
                    break;
                case "-":
                    result = a1 - a2;
                    break;
                case "*":
                    result = a1 * a2;
                    break;
                case "/":
                    result = a1 / a2;
                    break;
            }
        }
        return result;
    }
 }
