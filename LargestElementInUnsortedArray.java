package Array;

public class LargestElementInUnsortedArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,78,67,45,2};
        int max=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
           if (arr[i]> max){
               max=arr[i];

            }
            System.out.println(max);

        }


    }
}
