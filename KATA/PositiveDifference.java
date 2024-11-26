import java.util.Scanner;
    public class PositiveDifference{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter second number: ");
            int number2 = input.nextInt();
            getPositiveDifference(number1, number2);
            System.out.print(getPositiveDifference(number1, number2));

        }
        public static int getPositiveDifference(int integer1, int integer2){
            int positiveDifference = 0;
            if (integer1 < integer2){
                int temporaryInteger = integer1;
                integer1 = integer2;
                integer2 = temporaryInteger;
                positiveDifference = integer1 - integer2;
            }  
            else positiveDifference = integer1 - integer2;
            return positiveDifference; 

        }
    }
