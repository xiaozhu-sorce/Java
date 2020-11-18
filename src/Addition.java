public class Addition {
    public int additionInt(int x,int y){
        int sum=x+y;
        return sum;
    }
    public long additionLong(long x,long y){
        long sum=x+y;
        return sum;
    }
    public double additionDouble(double x,double y){
        double sum=x+y;
        return sum;
    }
    public float additionFloat(float x,float y){
        float sum=x+y;
        return sum;
    }
    public String additionString(String x,String y){
        String sum=x+y;
        return sum;
    }
    public static void main(String[]args){
        Addition add=new Addition();
        System.out.println("sum is"+add.additionInt(1,2));
        System.out.println("sum is"+add.additionDouble(1.1,2.2));
        System.out.println("sum is"+add.additionString("1","2"));
    }
}
