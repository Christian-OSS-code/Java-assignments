import java.util.Arrays;
    public class ElementAlternation{

        public static void main(String[] args){
            String[] letters = {"a", "e", "i", "o", "u"};
            int[] numbers = {3, 4, 5, 10, 6};
            String[] alternateList = alternationOfEntries(letters, numbers);
            System.out.print(Arrays.toString(alternateList));
    

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





