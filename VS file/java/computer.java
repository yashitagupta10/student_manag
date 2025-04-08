class demo
{
    public void playmusic()
    {
        System.out.println("music playing");
    }
    public String getmepen(int cost)
    {
        if(cost>=10)
        return "pen";
        
    }
}
public class computer{
    public static void main(String A[])
    {
        computer obj= new computer();
        obj.playmusic();
        String str= obj.getmepen(10);
        System.out.println(str) ; 
    }
}
