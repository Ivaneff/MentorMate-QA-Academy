package operatorsExpressions;

public class ArrayLargestNumber {
    public static void main(String[] args) {
        int[] arr ={5,3,0,19,57,18,32,48,7};
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>largestNumber){
                largestNumber=arr[i];
            }
        }
        System.out.println("The largest number of the array is: "+largestNumber);
    }
}
