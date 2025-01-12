import java.util.Scanner;;
class LeftRotateByK {
    public static void main(String[] args){
        int n=7;
        int[] arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of Rotation needed:");
        int d=sc.nextInt();
        d=d%n;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        System.out.println("Temp is:");
        for(int i=0;i<d;i++){
            System.out.print(temp[i] + " ");
        }

        for(int x=d;x<n;x++){
            arr[x-d]=arr[x];
        }
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
        System.out.println("result is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
