public class RunningTotal{  
    public static void main(String[] args){
        int[] numberList = {2, 5, 7, 8, 10};
        runningSum(numberList);
        System.out.print(runningSum(numberList));
        
    }
    public static int runningSum(int[] number){
        int[] numberList = {2, 5, 7, 8, 10};
        int total = 0;
        for (int count = 0; count < numberList.length; count ++){
            total += numberList[count];

        }
        return total;

    }
}
