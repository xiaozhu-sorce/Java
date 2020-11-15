public class Number {
    private int n1;
    private int n2;
    public Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void addition(){
        System.out.println("the result is:"+(n1+n2));
    }
    public void subtration(){
        System.out.println("the result is:"+(n1-n2));
    }
    public void multiplication(){
        System.out.println("the result is:"+(n1*n2));
    }
    public void division(){
        System.out.println("the result is:"+(n1/n2));
    }
    public static void main(String[]args){
        Number zhu=new Number(3,4);
        zhu.addition();
        zhu.division();
        zhu.multiplication();
        zhu.subtration();
    }
}