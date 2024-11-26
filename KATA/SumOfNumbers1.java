public class SumOfNumbers1{
    public static void main(String[] args){
        int[] numberList = {3, 4, 5, 7, 15, 2};
        printSumOfNumbers(numberList);
        System.out.print(printSumOfNumbers(numberList) + "\n");
        

    }
    public static int printSumOfNumbers(int[] numbers){
        int total = 0;
        int[] numberList = {3, 4, 5, 7, 15, 2};
        for (int count = 0; count < numberList.length; count ++){
            total += numberList[count];

        }
        return total;
      

    }


}
