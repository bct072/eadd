
public class FactoryMain {

   public static void main(String[] args) {
      BikeFactory bikeFactory = new BikeFactory();

      //get an object of Honda and call its getPrice method.
      Bike shape1 = bikeFactory.getBike("Honda");

      //call getPrice method of Honda
      shape1.getPrice();

      //get an object of TVS and call its getPrice method.
      Bike shape2 = bikeFactory.getBike("TVS");

      //call getPrice method of TVS
      shape2.getPrice();

      //get an object of Yamaha and call its getPrice method.
      Bike shape3 = bikeFactory.getBike("Yamaha");

      //call getPrice method of Yamaha
      shape3.getPrice();
   }
}