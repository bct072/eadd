
public class iOS extends Abstract_Factory {
   @Override
   public Mobile getPrice(String mobileType){    
      if(mobileType.equalsIgnoreCase("Samsung_Galaxy")){
         return new Samsung_Galaxy();         
      }else if(mobileType.equalsIgnoreCase("OnePlus")){
         return new OnePlus();
      }	 
      return null;
   }
}