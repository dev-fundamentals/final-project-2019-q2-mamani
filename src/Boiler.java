
public class Boiler extends Container{
	
	public Boiler() {
		super();
	}
	
	void fillWater(int quantity) {
		int aux = this.quantity + quantity;
		if(aux <= 12){
			this.quantity += quantity;
			if(this.quantity > 0) {
				setState(NOT_EMPTY);
			}
		}else {
			System.out.println("The current quantity is: " + this.quantity + " The given quantity is higher than supported capacity");
		}
		
	}
	
	

}
