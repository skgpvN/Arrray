package Array;

public class MaximumAndMinimumInArray {
    public static void main(String[] args) {
        int arr[] = {10, 3, 6, 7, 9, 1, 11,25};
        int A = arr.length;
        int maximum = arr[0];
        for (int i = 1; i < A; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("maximum: " + maximum);

        int minimum=arr[0];
        for (int i = 1; i < A; i++) {
            if (arr[i] < minimum) {
                minimum=arr[i];
            }
        }
        System.out.println("minimum: " + minimum);
        int diff=maximum-minimum;
        System.out.println(diff);
    }
}
