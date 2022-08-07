package Array;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8, 9};
        int n=4;
        int N= arr.length;
        for (int i = 0; i < n; i++) {
            int j,Last;
            Last=arr[N-1];
            for ( j = N-1; j >0 ; j--) {
                arr[j]=arr[j-1];


            }
            arr[0]=Last;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
