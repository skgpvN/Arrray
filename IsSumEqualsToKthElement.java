package Array;

public class IsSumEqualsToKthElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10, 20, 50, 90, 180};
        int sum=0;
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            sum=sum+arr[i];
        }if(sum==arr[n-1]){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

}
