public class WuMingFen
{
    private String theMa;
    private int quantity;
    private boolean likeSoup;
    public WuMingFen(String s,int q,boolean l)//构造器名与类名相同
    {
        this.theMa=s;
        this.quantity=q;
        this.likeSoup=l;
    }
    public WuMingFen(String s,int q )
    {
        this.theMa=s;
        this.quantity=q;
    }
    public void check()
    {
        if (likeSoup==true)
        {
            String d1="带汤的";
            System.out.println("面："+theMa+" "+"分量："+quantity+" "+d1);
        }
        else
            {
            String d2="不带汤的";
            System.out.println("面："+theMa+" "+"分量："+quantity+" "+d2);
        }
    }
    public static void main(String[]args)
    {
        WuMingFen lian=new WuMingFen("沙茶面",2,true);
        lian.check();
    }
}