 class  Human {
    private int age;
    private String name;
    

    public Human()
    {
        age =12;
        name="yashita";

    }

    public human (int a,String n)
    {
        age=a;
        name=n; 
    }
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;

    }
   
}
public class setget

{
    public static void main(String[] args) 
    {
        
    
    Human obj=new Human();
    Human obj1=new human(18,"anayra");
    System.out.println(obj.getName() + " :" + obj.getAge());
    System.out.println(obj1.getName() + " :" + obj1.getAge());

    }

}