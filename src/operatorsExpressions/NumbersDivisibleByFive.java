package operatorsExpressions;

public class NumbersDivisibleByFive {
    public static void main(String[] args) {
        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i : arr) {
            if(i>150){
                break;
            } else if (i%5==0) {
                System.out.print(i+" ");
            }
        }
    }
}
