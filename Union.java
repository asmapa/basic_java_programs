import java.util.*;

class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int n1 = 6;
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        int n2 = 6;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();
        
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else { // Both are equal
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        
        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);
    }
}
