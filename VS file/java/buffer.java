public class buffer {
    public static void main(String[] args) {
        
        StringBuffer sb= new StringBuffer("yashita");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.insert(6, "kamlesh");//different function can be performed like delete, capacity append etc
        System.out.println(sb);
    }
}
