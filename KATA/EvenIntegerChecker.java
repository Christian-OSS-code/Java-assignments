import java.util.Scanner;
    public class EvenIntegerChecker{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter integer: ");
            int number = input.nextInt();
            evenNumberCheck(number);
            System.out.print(evenNumberCheck(number));
            

        }
        public static boolean evenNumberCheck(int integer){
            boolean check = false;
            if (integer % 2 == 0) check = true;
            
            else check = false;
    
            return check;
        }
    }
    
