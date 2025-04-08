class human

{
   private int age=20;
   private String name="YASHITA";
public int getAge()
{
   return age;
}

public String getName()
 {
   return name;
 }
}
public class enscapsulation
{
   public static void main(String[] args) {
      
      human obj=new human();
     // obj.age=11;
      //obj.name="Yashita";
      System.out.println(obj.getName()+ " : " + obj.getAge());

   }
}