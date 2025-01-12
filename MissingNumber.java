class MissingNumber {
    public static void main(String[] args){
        int[] arr={1,2,4,5};
        int a=4;
        int n=5;
        int sum= (n*(n+1))/2;
        System.out.println(sum);
        int s2=0;
        for(int i=0;i<a;i++){
             s2 += arr[i];
        }
        int finall = sum-s2;
        if(finall==0){
            System.out.println("No Missing Number");
        }else{
            System.out.println("Missing Number is" + finall);
        }

    
}
}
