 class Mobile {
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand +" : " + price + " : " + name);

    }

    }

    public class demo
    {
        public static void main(String[] args) {
            Mobile obj1 = new Mobile();
            obj1.brand = " Apple";
            obj1.price = 1500;
            obj1.name = "smartphone";

            Mobile obj2 = new Mobile();
            obj2.brand = " Xiaomi";
            obj2.price =  1600;
            obj2.name = "smartphone";

            obj1.name = "phone";    //this is used to change static value,
                                   //static values are the value 
                                   //which is  used by6 whole program
                                   
                                   
                                   
          obj1.show();
            obj2.show();
        }
        }
    
