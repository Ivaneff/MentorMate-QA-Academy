package dataStructures;

public class SumElements {
    public static void main(String[] args) {
        int[] arr = {3, 12, 48, 6, -1, 10};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
