public class Pgm1_class
{
    public static void main(String[] arg)
    {
        Rectangle r1;
        r1= new Rectangle();
        r1.data(3, 9);
        r1.find();
        r1.print();
    }
}
class Rectangle
{
    float len;
    float bre;
    float area;
    void data(float a,float b)
    {
        len=a;
        bre = b;
    } 
    float find()
    {
        area=len*bre;
        return area;
    }
    void print(){
        System.out.println("area :"+area);
    }
}