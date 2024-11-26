public class SumOfNumbers2{
    public static void main(String[] args){
        int[] numberList = {-3, 5, 2, -9, 15};
        printSumOfNumbers(numberList);
        System.out.println(printSumOfNumbers(numberList));
     
        
            
    }
    public static int printSumOfNumbers(int[] numbers){
        int[] numberList = {-3, 5, 2, -9, 15};
        int count = 0;
        int total = 0;
        while (count < numberList.length){
            total += numberList[count];
        count ++;  

        }
        return total;

    }



}
