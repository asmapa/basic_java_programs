class pgm{
    private char str[];
    public int len=0;
    int found=1;
    pgm(char str[]){
        this.str=str;
    }
    void find_length(){
        for(int i=0;str[i]!='\0';i++){
            len++;
        }
    }
    void palindrom(){
        int start=0;
        int end=len-1;
        
        while(start<end){
            if(str[start]!=str[end]){
                found=0;
                break;

            }
            start++;
            end--;
        }
    }
    void result(){
        if(found==1){
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}


public class Class_pgm3{
    public static void main(String[] args){
        char str[]={'a','b','b','a','b','\0'};
        pgm obj;
        obj=new pgm(str);
        obj.find_length();
        obj.palindrom();
        obj.result();
    }
}