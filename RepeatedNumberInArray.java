package Array;

public class RepeatedNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3, 8, 8, 8, 9};
        int x = 8;
        int i;
        int count = 0;
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (i = 0; i < arr.length; i++) {
            // for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == x) {
                count = count + 1;
            }

        }
        System.out.println(count);
        System.out.println(i);
    }
}




