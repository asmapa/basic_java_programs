class LeftRotateByOne {
    public static void main(String[] args){
        int n=7;
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,2,3,4,5,6,7};
        int StartVal=arr[0];
        int LastVal=arr2[n-1];
        //Left Rotation
        for(int i=0;i < n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=StartVal;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
       //Right Rotation
        for(int i=n-1;i >0;i--){
            arr2[i]=arr2[i-1];
        }
        arr2[0]=LastVal;
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
