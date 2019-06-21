
public class BikeFactory {
	
   //use getBike method to get object of type bike 
   public Bike getBike(String bikeType){
      if(bikeType == null){
         return null;
      }		
      if(bikeType.equalsIgnoreCase("Honda")){
         return new Honda();
         
      } else if(bikeType.equalsIgnoreCase("TVS")){
         return new TVS();
         
      } else if(bikeType.equalsIgnoreCase("Yamaha")){
         return new Yamaha();
      }
      
      return null;
   }
}