 /*Remove Duplicates From a Sorted Array */
 
 class RemoveDuplicate {

    public static void main(String[] args){
        int n = 11; // Size of the array
        int[] arr = {1,1,2,2,3,3,3,4,4,5,5};
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
}
