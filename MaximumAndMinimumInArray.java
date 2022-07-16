package Array;

public class MaximumAndMinimumInArray {
    public static void main(String[] args) {
        int arr[] = {-2,-1, 10, 3, 6, 7, 9, 1};
        int A = arr.length;
        int maximum = 0;
        for (int i = 0; i < A; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("maximum: " + maximum);

        int minimum=0;
        for (int i = 0; i < A; i++) {
            if (arr[i] < minimum) {
                minimum=arr[i];
            }
        }
        System.out.println("minimum: " + minimum);

    }
}
