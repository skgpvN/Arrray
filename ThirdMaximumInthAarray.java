package MockEasy;

public class ThirdMaximumInthAarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int N= arr.length;
        int max3=0;
        int max2=0;
        int max1=0;
        for(int i=0; i<N; i++){
        if(arr[i]>max1){
            max3=max2;
            max2=max1;
            max1=arr[i];

           }
        if(arr[i]<max1 && arr[i]>max2){
            max3=max2;
            max2=arr[i];

        }
           if(arr[i]<max2 && arr[i]>max3){
           max3=arr[i];

            }

        }
        System.out.println(max3);

    }
}
