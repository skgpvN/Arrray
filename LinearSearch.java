package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        // Using User Input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Numbers[] = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            Numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == x) {
                System.out.println(i);
                break;
            }
        }
        if (i == Numbers.length) {
            System.out.println("not found");

        }
// Using hard coated value
        int arr[]={1,3,4,5};
        int Size= arr.length;
        int number=3;
        for(i=0; i<Size; i++){
            if(arr[i]==number){
                System.out.println(i);
                break;
            }
            if(i==arr.length){
                System.out.println("Not found");
            }
        }
    }

}
