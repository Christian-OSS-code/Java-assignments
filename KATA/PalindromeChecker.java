import java.util.Scanner;
    public class PalindromeChecker{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the word: ");
            String word = input.nextLine();
            palindromeCheck(word);
            System.out.print(palindromeCheck(word));
       }
        public static boolean palindromeCheck(String letter){
            int count1 = 0;
            int count2 = letter.length() - 1;
            while (count1 < count2){
                if (letter.charAt(count1) != letter.charAt(count2)){
                    return false; 

                }
                count1 ++;
                count2 --;
                
            }
            return true;
    

        } 

    }

        
