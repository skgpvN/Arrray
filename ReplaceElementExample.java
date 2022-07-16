package Array;

public class ReplaceElementExample {
    public static void main(String[] args) {
        int arr[]={1,4,4,5,6};
        int n=arr.length;
        int arr1[]=new int[n];
        for (int i = 0; i < n; i++){
            if(i==0){
                arr1[i]=arr[i]*arr[i+1];
            }
            else if(i==n-1){
                arr1[n-1]=arr[n-1]*arr[n-2];
            }else{
                arr1[i]=arr[i]/2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");

        }
    }
}
