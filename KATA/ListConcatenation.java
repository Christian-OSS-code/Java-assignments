import java.util.Arrays;
public class ListConcatenation{
    public static void main(String[] args){
        String[] letters = {"a", "b", "c", "d", "e"};
        int[] numbers = {1, 2, 4, 7};
        String[] mergeList = concatenation(letters, numbers);
        System.out.print(Arrays.toString(mergeList));
    }
    public static String[] concatenation(String[] charactersEntry, int[] integersEntry){

        String[] mergeList = new String[charactersEntry.length + integersEntry.length];
        for (int count = 0; count < charactersEntry.length; count ++){
            mergeList[count] = charactersEntry[count];
        }
        for (int count =  0; count < integersEntry.length; count ++){
            mergeList[count + charactersEntry.length] = String.valueOf(integersEntry[count]);

        }
        return mergeList;



    } 
}

