package factory;

public class Control {
	
	public Mobile choice(String str)
	{
		if(str.equalsIgnoreCase("iphone"))
		{
			return new Iphone();
		}
		if(str.equalsIgnoreCase("samsung"))
		{
			return new Samsung();
			
		}
		if(str.equalsIgnoreCase("sony"))
		{
			return new Sony();
			
		}
		if(str.equalsIgnoreCase("blackberry"))
		{
			return new Blackberry();
			
		}
		
		return null;
	}
	
}
