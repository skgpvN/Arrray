package Array;

public class LargestElementInUnsortedArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,78,67,45,2};
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
           if (arr[i]< arr[i+1]){
               max=arr[i+1];

            }
            System.out.println(max);

        }


    }
}
