
import java.util.Scanner;
public class palindrom{

    public static void main(String[] args){
        //System.out.println("hello");
        //Scanner in=new Scanner(System.in);
        //System.out.println("enter a string:\t");
        //String str=in.nextLine();
        char str[]={'a','b','b','a','b','\0'};
        int start=0;
        int len=0;

        for(int i=0;str[i]!='\0';i++){
            len++;
        }
        int end=len-1;
        boolean ispalindrom=true;
        while(start<end){
            if(str[start]!=str[end]){
                ispalindrom=false;
                break;

            }
            start++;
            end--;
        }
        if(ispalindrom){
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
        }

    }
