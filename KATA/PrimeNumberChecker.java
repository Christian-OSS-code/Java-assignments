import java.util.Scanner;
    public class PrimeNumberChecker{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = input.nextInt();
            primeNumberCheck(number);
            System.out.print(primeNumberCheck(number));
        }
        public static boolean primeNumberCheck(int integer){
                int counter = 0;
                for (int count = 1; count < integer; count ++){
                    if (integer % count == 0){
                        counter ++;
                    }
        }
        if (counter == 1) return true;
        else return false;
        }
    }
