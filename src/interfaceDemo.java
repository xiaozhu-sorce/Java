interface Vehiclee
{
    public void start();
    public void stop();
}
public class interfaceDemo
{
    public static void main (String[]args){
        Bike bi=new Bike();
        Bus bu=new Bus();
        bi.start();
        bi.stop();
        bu.start();
        bu.stop();
    }
}
class Bike implements Vehiclee
{
    public void start(){
        System.out.println("i am bike,i am running.");
    }
    public void stop(){
        System.out.println("i am bike,i am stop.");
    }
}
class Bus implements Vehiclee
{
    public void start(){
        System.out.println("i am bus,i am running.");
    }
    public void stop(){
        System.out.println("i am bus,i am stop.");
    }
}