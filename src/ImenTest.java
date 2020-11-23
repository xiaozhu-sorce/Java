interface Imen
{
    public void threfproof();
    public void waterproof();
    public void fireproof();
    public void bulletproof();
    public void rustproof();
}
public class ImenTest
{
    public static void main(String[]args){
       men m=new men();
       m.bulletproof();
       m.closedoor();
       m.fireproof();
       m.opendoor();
       m.rustproof();
       m.threfproof();
       m.waterproof();
    }
}
abstract class Door
{
    public void opendoor(){}
    public void closedoor(){}
}
class men extends Door implements Imen
{
    public void opendoor(){
        System.out.println("open door");
    }
    public void closedoor(){
        System.out.println("close door");
    }
    public void threfproof(){
        System.out.println("fang dao");
    }
    public void waterproof(){
        System.out.println("fang shui");
    }
    public void bulletproof(){
        System.out.println("fang dan");
    }
    public void rustproof(){
        System.out.println("fang xiu");
    }
    public void fireproof(){
        System.out.println("fang huo");
    }
}
