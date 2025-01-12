
/*This Is The Program To Find largest of an array */

import java.util.*;
import java.io.*;

class LargestElement {

    // Function to find the largest 'd' elements in the array
    public static int LargestOne(int[] arr, int n) {
        int Largest = arr[0];
        for(int i=1;i<n;i++){
            if(Largest < arr[i]){
                Largest=arr[i];
            }
        }
       return Largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        int n = 7; // Size of the array
        int[] arr = {100000, 2, 3, 100, 5, 6, 7};

        // Call the LargestOne function
        int largestElements = LargestOne(arr, n);

        // Print the largest elements
        System.out.println("Largest " + largestElements);
       
    }
}
