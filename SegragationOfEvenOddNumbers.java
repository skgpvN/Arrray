package Array;

public class SegragationOfEvenOddNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int index = 0;
        int n = arr.length;
        int arr1[] = new int[n];
        //finding even and sorting
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        //finding odd and sorting
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        //printing new array
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]);
        }
        //print sum of add number
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];

            }

        }
        System.out.println(sum);


    }
}
