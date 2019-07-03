
public class CoffeeMaker {
	
	private static final String ON = "on";
	private static final String OFF = "off";
	private String state;
	private String light;
	
	Receptacle receptacle;
	Boiler boiler;
	
	public CoffeeMaker() {
		receptacle = new Receptacle();
		boiler = new Boiler();
	}
	
	public void start() {
		
		state = ON;
		light = ON;
	}
	
}
