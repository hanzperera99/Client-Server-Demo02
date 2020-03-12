import java.security.spec.ECField;
import java.util.Arrays;

public class SimpleCalculatorServer
{
    public boolean isServerConnected()
    {
        System.out.println("[SERVER] - Connection is being tested...");
        return true ;
    }

    public int addIntegerNumbers(int a , int b)
    {
        System.out.println("[SERVER] - Adding " + a + " and " + b );
        return a+b ;
    }

    public int divideIntegerNumbers(double a , double b) throws Exception {
        if(b == 0.0)
        {
            throw new Exception() ;
        }

        if( (a == 0.0) && (b == 0.0))
        {
            throw new Exception() ;
        }
        System.out.println("[SERVER] - Dividing " + a + " and " + b );
        return (int) (a/b);
    }

    public int multiplyIntegerNumbers(int a , int b)
    {
        System.out.println("[SERVER] - Multiplying " + a + " and " + b );
        return a*b ;
    }

    public int subtractIntegerNumbers(int a , int b)
    {
        System.out.println("[SERVER] - Subtracting " + a + " and " + b );
        return a-b ;
    }

    public int[] addNumberInArrays(int firstArray[], int secondArray[]) throws Exception {
        if(firstArray.length < secondArray.length)
        {
            throw new Exception() ;
        }

        else if(secondArray.length > firstArray.length)
        {
            throw new Exception() ;
        }

        else
        {
            System.out.println("[SERVER] - Adding " + Arrays.toString(firstArray) + " and " + Arrays.toString(secondArray) );
            int a = firstArray[0] + secondArray [0] ;
            int b = firstArray[1] + secondArray [1] ;
            int c = firstArray[2] + secondArray [2] ;

            int thirdArray[]=new int[3] ;
            thirdArray[0] = a ;
            thirdArray[1] = b ;
            thirdArray[2] = c ;

            return thirdArray ;
        }
    }

    public int[] divideNumbersInArrays(int thirdArray[], int fourthArray[]) throws Exception {

        for(int i = 0 ; i < thirdArray.length ; i++)
        {
            if(thirdArray[i] == 0)
            {
                throw new Exception() ;
            }
            else if(fourthArray[i] == 0)
            {
                throw new Exception() ;
            }
            break;
        }

        System.out.println("[SERVER] - Dividing " + Arrays.toString(thirdArray) + " and " + Arrays.toString(fourthArray) );
        int a = thirdArray[0] / fourthArray [0] ;
        int b = thirdArray[1] / fourthArray [1] ;
        int c = thirdArray[2] / fourthArray [2] ;

        int finalArray[]=new int[3] ;
        finalArray[0] = a ;
        finalArray[1] = b ;
        finalArray[2] = c ;

        return finalArray ;
    }

}
