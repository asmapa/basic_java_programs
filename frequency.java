import java.util.Scanner;
public class frequency{
    public static void main(String[] args){
        /*Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=in.nextLine();*/
        char str[]={'a','b','b','a','\0'};
        int len=0;
        for(int i=0;str[i]!='\0';i++){
            len++;
        }
        
        for(char ch='a';ch<='z';ch++){

            int c=0;
            for(int i=0;i<len;i++){
                if(ch==str[i]){
                    c++;
                }
            }
            if(c!=0){
                System.out.println(ch + "\t\t" + c);

        }
     
        }
    }
}