public class Lianxi
{
    private int i;
    public Lianxi(int i)
    {
        Lianxi lian=new Lianxi();
        lian.seti(i);
        lian.geti();
        System.out.println("i="+i);
    }
    public Lianxi()
    {}
    public int geti()
    {
        return i;
    }
    public void seti(int i)
    {
        this.i=i;
    }
    public static void main(String[] dsa)
    {
        Lianxi lian=new Lianxi(3);
    }
}
