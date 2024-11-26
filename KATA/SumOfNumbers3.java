public class SumOfNumbers3{
    public static void main(String[] args){
        int[] numberList = {0, -1, 4, 12, -3, 12};
        getSumOfNumbers(numberList);
        System.out.print(getSumOfNumbers(numberList));
        

    }
    public static int getSumOfNumbers(int[] numbers){
        int[] numberList = {0, -1, 4, 12, -3, 12};
        int count = 0;
        int sum = 0;
        do{
            sum += numberList[count];
            count ++;
        }
        while (count < numberList.length);
        return sum;

    }



}
