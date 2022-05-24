package operatorsExpressions;

public class ReverseList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            arr2[arr2.length - i] = arr[i - 1];
        }
        for (int i : arr2) {
            System.out.print(i + ", ");
        }
    }
}
