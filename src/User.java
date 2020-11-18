public class User{
    private int id;
    private String pw;
    private String e_add;
    public User(int i,String s1,String s2){
      this.id=i;
      this.pw=s1;
      this.e_add=s2;
      System.out.println(id+"\n"+pw+"\n"+e_add);
    }
    public User(int i,String s1){
        this.id=i;
        this.pw=s1;
        this.e_add=id+"@gameschool.com";
        System.out.println(id+"\n"+pw+"\n"+e_add);
    }
    public static void main(String[]args){
        User u=new User(790362227,"123456","@790362227.com");
        User e=new User(790362227,"123456");
    }
}
