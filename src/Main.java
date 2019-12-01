import java.util.Scanner;

public class Main {


   /* if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.

    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

    Note: If the number is a multiple of both 3 and 5, only count it once.
*/
    static int solution(int number) {

        int result=0;
        boolean threemultiple=false ;
        boolean fivemutiple=false;

        for (int i=3; i<number;i++) {

            threemultiple = i%3==0;
            fivemutiple = i%5==0;
            if (threemultiple || fivemutiple) result+=i;

        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println(" ВВедите число : " ) ;

        Scanner sc= new Scanner(System.in);

        int number=sc.nextInt();

        number = solution(number);

        System.out.println(" Summ of multiples / Сумма кратных 3 и 5  : " + number ) ;


    }
}
