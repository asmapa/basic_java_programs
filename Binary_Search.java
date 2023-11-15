
import java.util.Scanner;

public class binary_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] sortedArray = new int[size];
        System.out.println("Enter sorted elements:");

        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
        }

       
        // Input element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Performing binary search
        int result = binarySearch(sortedArray, target);

        // Displaying the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Binary search method
    static int binarySearch(int[] arr, int target) {
        int left= 0;
        int right= arr.length - 1;

        while (left <= right) {
            int mid =  (left+right) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }
}
