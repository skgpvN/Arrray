package Array;

public class SumOfLargestAndSecondLargestInUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 66, 8, 7, 45, 55, 68};
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2=max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i]>max2){
                max2=arr[i];
            }

        }
        System.out.println(max);
        System.out.println();
        System.out.println(max2);
        System.out.println();
        int sum=max+max2;
        System.out.println(sum);

    }
}
