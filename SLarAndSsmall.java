/*Find The second Largest And Second Smallest */
class SLarAndSsmall {


    public static int secondLargest(int[] arr,int n){
        int Largest=arr[0];
        int Slarg=0;

        for(int i=1;i<n;i++){
            if(Largest < arr[i]){
                Slarg=Largest;
                Largest=arr[i];
            }else if(arr[i] < Largest && arr[i] > Slarg){
                Slarg=arr[i];
            }
        }
        return Slarg;
    }

    public static int secondSmallest(int[] arr,int n){
        int Small=arr[0];
        int ssmall=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(Small > arr[i]){
                ssmall=Small;
                Small=arr[i];
            }else if(arr[i] > Small && arr[i] < ssmall){
                ssmall=arr[i];
            }
        }
        return ssmall;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     
        int n = 7; // Size of the array
        int[] arr = {100000, 1, 2, 0,100, 1000, 6, 7};

        // Call the LargestOne function
        int slarge = secondLargest(arr, n);
        int ssmall = secondSmallest(arr,n);

        // Print the largest elements
        System.out.println("Largest " + slarge);
        System.out.println("Smallest" + ssmall);


    }
}
