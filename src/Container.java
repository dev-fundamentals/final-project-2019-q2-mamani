
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
	
	private void setState(String state) {		
		this.state = state;
		
	}
	
	private String getState() {
		return state;
	}
}
