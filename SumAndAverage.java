package Array;

public class SumAndAverage {
    public static void main(String[] args) {
        int arr[] = {-1, 10, 3, 6, 7, 9, 1, 5};
        int A = arr.length;
        int sum=0;
        int i;
        for(i=0;i<A;i++){
            sum=sum+arr[i];
            // System.out.println(sum);
        }
        System.out.println(sum);
        float avg=(float)sum/A;
        System.out.println(avg);
    }
}
