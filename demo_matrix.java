class pgm{
    public int data[][];
   
    public int row;
    public int col;
    private int i,j,k;
    
    public pgm(int row,int col,int data[][]){
        this.row=row;
        this.col=col;
        this.data=new int[this.row][this.col];

        for(i=0;i<this.row;i++){
            for(j=0;j<this.col;j++){
                this.data[i][j]=data[i][j];
            }
        }
    }
    void print(){
         //printing first matrix

         System.out.println("matrix is:\t");
         for( i=0;i<this.row;i++){
             for(j=0;j<this.col;j++){
                System.out.println(this.data[i][j] + "");
             }
             System.out.println();
         }
        }

        public pgm mul(pgm second) {
        

            int resultRow = this.row;
            int resultCol = second.col;
            int resultData[][]  = new int[resultRow][resultCol];
    
            for (int i = 0; i < resultRow; i++) {
                for (int j = 0; j < resultCol; j++) {
                    
                    for (int k = 0; k < this.col; k++) {
                        resultData[i][j] += this.data[i][k] * second.data[k][j];
                    }
                }
            }
    
            return new pgm(resultRow, resultCol, resultData);
        }
 
        
    void calculate(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    ef[i][j]=ef[i][j]+ab[i][k]*cd[k][j];
                }
            }
        }
    }
    void result(){
        System.out.println("multiplied matrix answer:\t");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
               System.out.println(ef[i][j] + "");
            }
            System.out.println();
        }
    }
}



public class demo_matrix{
    public static void main(String[] args){
        int a[][]={{1,2,3},{2,3,4,},{6,7,8}};
        int b[][]={{1,2,3},{2,3,4,},{6,7,8}};
        
         
         pgm obj=new pgm(3,3,a);
         obj.print();
         pgm obj2=new pgm(3,3,b);
         obj2.print();
         pgm obj3=obj.mul(obj2);
         obj3.print();


    }
}
