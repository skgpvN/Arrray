package Array;

public class LargestElementInUnsortedArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,78,67,45,45, 80,81};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (arr[i]> max){
               max=arr[i];

            }


        }
        System.out.println(max);


    }
}
