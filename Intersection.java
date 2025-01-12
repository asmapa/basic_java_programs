
import java.util.*;
class Intersection {
    public static void main(String[] args){
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int n1 = 6;
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        int n2 = 6;

        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while( i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(intersection);
    }
}
