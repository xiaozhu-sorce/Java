public class lianxi{
    public  static void main(String[]args){
        card c=new card();
        c.NoOfWheels();
        MotorBike m=new MotorBike();
        m.NoOfWheels();
    }
}
abstract class Vehicle
{
    public void NoOfWheels(){}
}
class card {
    public void NoOfWheels() {
        System.out.println("四轮车");
    }
}
class MotorBike {
    public void NoOfWheels() {
        System.out.println("双轮车");
    }
}