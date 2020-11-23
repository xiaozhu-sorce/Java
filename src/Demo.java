interface method1
{
    public void buffer();//缓冲
    public void filter();//过滤
    public void heat();//加热
    public void sugar();//放糖
}
 class Water { }
class PurWatter extends Water implements method1
{
    public void buffer()
    {
        System.out.println("第一步，水缓冲");
    }
    public void filter()
    {
        System.out.println("第二步，水过滤");
    }
    public void heat()
    {
        System.out.println("第三步，水加热");
    }
    public void sugar()
    {
        System.out.println("第四步，水加糖");
    }
}
public class Demo
{
    public static void main (String[]args)
    {
        PurWatter pw=new PurWatter();
        pw.buffer();
        pw.filter();
        pw.heat();
        pw.sugar();
    }
}
