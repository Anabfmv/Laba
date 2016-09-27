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
            if (operation.equals("+")) {
                result = a1 + a2;

            } else if (operation.equals("-")) {
                result = a1 - a2;

            } else if (operation.equals("*")) {
                result = a1 * a2;

            } else if (operation.equals("/")) {
                result = a1 / a2;

            }
                    }
        return result;
    }


}
