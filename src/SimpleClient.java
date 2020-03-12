import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleClient
{
    SimpleCalculatorServer server = new SimpleCalculatorServer() ;

    public static void main(String[] args)
    {

        SimpleClient client = new SimpleClient() ;
        System.out.println("[CLIENT] - Creating instance of client....");
        client.executeTest() ;
    }

    private void executeTest()
    {
        System.out.println("[CLIENT] - Testing if the server is connected....");
        if(server.isServerConnected())
        {

            /*Addition*/
            System.out.println("*****************************Addition******************************");
            System.out.println("[CLIENT] - The Client is connected, the test can proceed....");
            int x = 2 ;
            int y = 3 ;
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            int z = server.addIntegerNumbers(x,y) ;
            System.out.println("[CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);

            if(z == x + y)
            {
                System.out.println("[CLIENT] - The client has returned the correct answer ");
            }
            else
            {
                System.out.println("[CLIENT] - The client has returned the wrong answer ");
            }


            /*Division*/
            System.out.println("*****************************Division******************************");
            int c = 4;
            int d = 3;
            double cD = c ;
            double dD = d ;
            System.out.println("[CLIENT] - Asking the server what is the division of " + c +  " and " + d) ;
            int e = 0;
            try {
                e = server.divideIntegerNumbers(cD,dD);

                System.out.println("[CLIENT] - The server has replied that the ratio of " + c + " and " + d + " is " + e);
                if(e == c/d)
                {
                    System.out.println("[CLIENT] - The client has returned the correct answer ");
                }
                else
                {
                    System.out.println("[CLIENT] - The client has returned the wrong answer ");
                }

            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[Client] - Test Completed");


            /*Multiplication*/
            System.out.println();
            System.out.println("*****************************Multiplication******************************");
            int f = 3;
            int g = 10;
            System.out.println("[CLIENT] - Asking the server what is the multiplication of " + f + " and " + g);
            int h = server.multiplyIntegerNumbers(f,g) ;
            System.out.println("[CLIENT] - The server has replied that the sum of " + f + " and " + g + " is " + h);
            if(h == f*g)
            {
                System.out.println("[CLIENT] - The client has returned the correct answer ");
            }
            else
            {
                System.out.println("[CLIENT] - The client has returned the wrong answer ");
            }


            /*Subtraction*/
            System.out.println("*****************************Subtraction******************************");
            int i = 10 ;
            int j = 7 ;
            System.out.println("[CLIENT] - Asking the server what is the subtraction of " + i + " and " + j);
            int k = server.subtractIntegerNumbers(i,j) ;
            System.out.println("[CLIENT] - The server has replied that the sub of " + i + " and " + j + " is " + k);
            if(k == i-j)
            {
                System.out.println("[CLIENT] - The client has returned the correct answer ");
            }
            else
            {
                System.out.println("[CLIENT] - The client has returned the wrong answer ");
            }


            /*Addition of arrays*/
            System.out.println("**************************Addition of arrays***************************");
            int firstArray[]=new int[3] ;
            firstArray[0] = 1;
            firstArray[1] = 2;
            firstArray[2] = 3;

            int secondArray[]=new int[3] ;
            secondArray[0] = 3;
            secondArray[1] = 4;
            secondArray[2] = 5;

            int finalArray[] ;
            try {
                finalArray = server.addNumberInArrays(firstArray , secondArray);
                System.out.println("[CLIENT] - The server has replied that the sub of " + Arrays.toString(firstArray) + " and " + Arrays.toString(secondArray) + " is " + Arrays.toString(finalArray));
                System.out.println("[CLIENT] - Correct answer is + " + Arrays.toString(finalArray));

            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }


            /*Division of arrays*/
            System.out.println("**************************Division of arrays***************************");
            int thirdArray[]=new int[3] ;
            thirdArray[0] = 4;
            thirdArray[1] = 15;
            thirdArray[2] = 18;

            int fourthArray[]=new int[3] ;
            fourthArray[0] = 4;
            fourthArray[1] = 3;
            fourthArray[2] = 6;

            int finalDevArray[] ;
            try {
                finalDevArray = server.divideNumbersInArrays(thirdArray , fourthArray) ;
                System.out.println("[CLIENT] - The server has replied that the division of " + Arrays.toString(firstArray) + " and " + Arrays.toString(secondArray) + " is " + Arrays.toString(finalDevArray));
                System.out.println("[CLIENT] - Correct answer is  " + Arrays.toString(finalDevArray));
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
        else
        {
            System.out.println("[CLIENT] - The Client is not connected, the test has failed....");
        }
    }



}
