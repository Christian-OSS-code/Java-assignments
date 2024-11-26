import java.util.Scanner;
import java.util.Arrays;
    public class IntegerToIntegerArray{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number: ");
            int number = input.nextInt();
            
            int[] numberList = getIntegerList(number);
            System.out.print(Arrays.toString(numberList));
            

        }
        public static int[] getIntegerList(int integers){
            String integerConverted = String.valueOf(integers);
            int[] numberList = new int[integerConverted.length()];
            int count = integerConverted.length();
            int remainder;
            while (count > 0){
                remainder = integers%10;
                numberList[count - 1] = remainder;
                integers = integers/10;
                count --;

            }
            return numberList;


        }
    


    }
