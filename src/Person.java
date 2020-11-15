public class Person {
    private String name;
    private int age;
    public Person (String n,int x){
        this.name=n;
        this.age=x;
    }
    public void dispilay(){
        System.out.println("name:"+name+"age:"+age);
    }
    public static void main (String[]args){
        Person zhu=new Person("xiaozhu",17);
        zhu.dispilay();

    }
}
