package Array;

import java.util.Scanner;

public class ArrayUserInputAndPrintAndReverse {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for (int i = size-1; i >=0; i--) {
            System.out.println(arr[i]);
        }


    }

}


