
public class Abstract_Factory_Main {
   public static void main(String[] args) {
	   
      //get Android factory
      Abstract_Factory mobileFactory = Factory_Producer.getFactory(false);
      
      //get an object of Android Mobile(Samsung_Galaxy)
      Mobile mobile1 = mobileFactory.getPrice("Samsung_Galaxy");
      
      //call getBrand method of Android Mobile(Samsung_Galaxy)
      mobile1.getBrand();
      
      
      //get an object of  Android Mobile(OnePlus)
      Mobile mobile2 = mobileFactory.getPrice("OnePlus");
      
      //call getBrand method of Mobile(OnePlus)
      mobile2.getBrand();
      
      
      //get iOS mobile factory
      Abstract_Factory mobileFactory1 = Factory_Producer.getFactory(true);
      
      //get an object of iOS mobile
      Mobile mobile3 = mobileFactory1.getPrice("Iphone");
      
      //call getBrand method of iOS mobile
      mobile3.getBrand();
   }
}