public class Vehicles {
    public String brand;
    public String color;
    public void run(){
        System.out.println("我已经开动了");
    }
    public Vehicles(String s,String t){
        this.brand=s;
        this.color=t;
    }

    public static void main(String[]args) {
        Vehicles veh=new Vehicles("dahuangfeng","yellow");
        veh.showlnfo();
        Car car=new Car("aodi","black",5);
        car.showCar();
        Truck tru=new Truck("dayun","red",1);
        tru.showCar();
    }

    private void showlnfo() {
        System.out.println("商标："+brand+"颜色："+color);
    }
}
class Car extends Vehicles {
    public int seats;
    public void showCar(){
        System.out.println("商标："+super.brand+"颜色："+super.color+"座位："+seats);
    }
    public Car(String s, String t,int i) {
        super(s, t);
        this.seats=i;
    }
}
class Truck extends Vehicles{
    public float load;
    public void showCar(){
        System.out.println("商标："+super.brand+"颜色："+super.color+"载重："+load);
    }
    public Truck(String s, String t,float f) {
        super(s, t);
        this.load=f;
    }
}
