import java.util.Scanner;
    public class ElementOccurrenceInAList{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number to check its occurrence: ");
            int checker = input.nextInt();
            
            int[] numberList = {1, 3, 9, 12, 23, 15};
            occurrence(numberList, checker);
            System.out.print(occurrence(numberList, checker));
            
        
        }
        public static boolean occurrence(int[] collection, int number){
            boolean find = false; 
            for (int element: collection){
                if (number == element){
                    find = true;
                    
                }
                else find = false;
            
            }
            return find;
        }
    }


