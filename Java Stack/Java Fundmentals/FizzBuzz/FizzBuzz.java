import java.util.Scanner;

public class FizzBuzz{
    public static  String FizzBuzztest(int a) {
        if(a%3==0)
        {
         String A="FIZZ";
         return A;
        }
        else if(a%5==0)
        {
            String B ="BUZZ";
            return B;
        }
        else
        { 
            String C="FIZZ BUZZ";
            return C;
        }
        

    }


public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter num");
System.out.print(FizzBuzztest(myObj.nextInt()));

}

}
