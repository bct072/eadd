
public class Android extends Abstract_Factory {
   @Override
   public Mobile getPrice(String mobileType){    
      if(mobileType.equalsIgnoreCase("Iphone")){
         return new Iphone();         
      }
      return null;
   }
}
