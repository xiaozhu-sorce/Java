public class StaticDemo {
    private static int x=10;
    private int y=5;
    public static void main(String[]args){
     StaticDemo s=new StaticDemo();
     System.out.println("静态变量："+x+"static关键字"+s.y);
    }
}
