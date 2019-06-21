
public class Factory_Producer {
   public static Abstract_Factory getFactory(boolean android){   
      if(android){
         return new Android();         
      }else{
         return new iOS();
      }
   }
}