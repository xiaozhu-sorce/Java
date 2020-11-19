public class car {
    private int wheel;
    private String color;
    private double weight;
    public car(){}
    public car(int wh,String c,double we){
        this.wheel=wh;
        this.color=c;
        this.weight=we;
    }
    public void SpeedUp(){
        System.out.println("I am speeding up.");
    }
    public void SpeedDown(){
        System.out.println("I am speeding down.");
    }
    public void Stop(){
        System.out.println("I am stop.");
    }
    public static void main (String[]args){
        car m=new car();
        car t=new car(4,"black",1.00);
        t.SpeedUp();
        t.SpeedDown();
        t.Stop();
    }
}
