public class Define {
    public Define(int x,int y){
        if (x>y){
            System.out.println("较大的数是："+x);
        }
        else {
            System.out.println("较大的数是："+y);
        }
    }
    public Define(double a,double b,double c){
        System.out.println("乘积是："+a*b*c);
    }
    public Define(String s1,String s2){
        if (s1.equals(s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main (String[]args){
        Define d1=new Define(2,3);
        Define d2=new Define(1.0,2.3,3.3);
        Define d3=new Define("aaaa","aa");
    }
}
