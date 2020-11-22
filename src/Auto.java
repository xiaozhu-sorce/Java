import org.omg.CORBA.PUBLIC_MEMBER;

public class Auto {
    private int type;
    private String color;
    private double weight;
    private int speed;
    public Auto(int t,String c,double w,int s){
        this.type=t;
        this.color=c;
        this.weight=w;
        this.speed=s;
    }
    public void SpeedUp()
    {
        System.out.println("I am speeding up.");
    }
    public void SpeedDown()
    {
        System.out.println("I am speeding down.");
    }
    public void Stop()
    {
        System.out.println("I am stop.");
    }
    public static void main(String[]args){
        Auto a=new Auto(4,"blue",2.00,1);
        a.SpeedUp();
        a.SpeedDown();
        a.Stop();
        Care c=new Care(4,"biue",2.00,1);
        c.SpeedUp();
        c.SpeedDown();
    }
}
class Care extends Auto
{
    public String air_condition;
    public int cd;
    public void SpeedUp()
    {
        System.out.println("wo zai jia su");
    }
    public void SpeedDown(){
        System.out.println("wo zai jian su");
    }
    public Care(int t, String c, double w, int s)
    {
        super(t, c, w, s);
    }

}