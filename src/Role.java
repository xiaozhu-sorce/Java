abstract class Role
{
    private String name;
    private int age;
    private  String sex;

    public abstract void play();
    public Role(){}
    public Role(String n,int a,String s){
        this.age=a;
        this.name=n;
        this.sex=s;
    }
    public static void main(String[]args)
    {
        Employee e=new Employee("zkm",17,"girl",2020,2002);
        Manager m=new Manager();
        m.play();
        e.play();
        e.sing();
        System.out.println(m.vehicle);
    }
}
class Employee extends Role
{
    public int id;
    public int salary;
    public Employee(){}
    public Employee(String n,int a,String s,int id,int sa)
    {
        super(n,a,s);
        this.id=id;
        this.salary=sa;
    }
    @Override
    public void play()
    {
        System.out.println("i can play");
    }
    public final void sing()
    {
        System.out.println("i can sing");
    }
}
class Manager extends Role
{
    protected final String vehicle="dahuangfeng";
    @Override
    public void play() {

    }

}
