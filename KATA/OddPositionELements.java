import java.util.Arrays;
public class OddPositionELements{
    public static void main(String... args){
        int[] numberList = {1, 3, 4, 6, 8, 10, 11, 15};
        int[] newList = printElementInOddPositions(numberList);
        System.out.print(Arrays.toString(newList));
        
    }
    public static int[] printElementInOddPositions(int[] number){
        int[] newList = new int[(number.length + 1)/2];
        for (int count = 1, count1 = 0; count < number.length && count1 < (number.length)/2; count = count + 2, count1 ++){
            newList[count1] = number[count];
            
        }
        return newList;
    }      

}
