
public abstract class Container {
	
	protected int quantity;
	private String state;
	protected static final String EMPTY = "empty";
	protected static final String NOT_EMPTY = "not_empty";
	
	public Container() {
		quantity = 0;
		state = this.EMPTY;
	}
	
	public Container(int quantity, String state) {
		this.quantity = quantity;
		this.state = state;
	}
	
	public void setState(String state) {		
		this.state = state;
		
	}
	
	protected String getState() {
		return state;
	}
	
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	protected int getQuantity() {
		return quantity;
	}
}
