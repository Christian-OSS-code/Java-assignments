import java.util.Scanner;
     public class Kata{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int numerator = input.nextInt();
        
            System.out.print("Enter the second number: ");
            int denominator = input.nextInt();
            getQuotient(numerator, denominator);
            System.out.print(getQuotient(numerator, denominator));
            
            String[] letters = {"a", "e", "i", "o", "u"};
            int[] numbers = {3, 4, 5, 10, 6};
            String[] alternateList = alternationOfEntries(letters, numbers);
            System.out.print(Arrays.toString(alternateList));
    


        }
        public static float getQuotient(int integer1, int integer2){
            int quotient = 0;
            quotient = integer1/integer2;
            if (integer2 == 0){
                quotient = 0;
            }
            return quotient;
            

        }
        public static String[] alternationOfEntries(String[] characters, int[] integers){
            String[] alternateList = new String[characters.length + integers.length];
            for (int count1 = 0, count = 0; count1 < characters.length + integers.length && count < characters.length; count1 = count1 + 2, count ++){
                alternateList[count1] = characters[count];
            }
            for (int count2 = 1, count = 0; count2 < characters.length + integers.length && count < integers.length; count2 = count2 + 2, count ++){
                alternateList[count2] = String.valueOf(integers[count]);
    
            }
            return alternateList;



        }
        



    }
