class MoveZeroToEnd {
    public static void main(String[] args){
        int n=10;
        int[] arr={1,0,3,4,5,0,10,0,9,0};
        int[] temp=new int[10];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp[k]=arr[i];
                k++;
            }
        }
     
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
