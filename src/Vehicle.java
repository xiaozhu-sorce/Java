public abstract class Vehicle {
    public void NoOfWheels() {
    }
    public  static void main(String[]args){
        card c=new card();
        c.NoOfWheels();
        MotorBike m=new MotorBike();
        m.NoOfWheels();
    }
}
class card extends Vehicle{
    public void NoOfWheels() {
        System.out.println("四轮车");
    }
}
class MotorBike extends Vehicle{
    public void NoOfWheels() {
        System.out.println("双轮车");
    }
}