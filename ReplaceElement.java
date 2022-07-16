package Array;

import java.util.Scanner;

public class ReplaceElement {

        public static void main (String[] args) {
            // Using User input
            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int arr[] = new int[N];
//            int result[] = new int[N];
//            for(int i=0;i<N;i++){
//                arr[i] = sc.nextInt();
//            }
            //using initialising array
            int arr[]={1,2,3,4};

            int N=arr.length;
            int result[]=new int[N+1];
            for(int i=0;i<N;i++){
                if(i==0){
                    result[i] = arr[i]*arr[i+1];
                }
                else if(i==N-1){
                    result[i] = arr[i]*arr[i-1];
                }
                else{
                    result[i] = arr[i-1]*arr[i+1];
                }
            }
            for(int i=0;i<N;i++){
                System.out.print(result[i]+" ");
            }
        }
    }