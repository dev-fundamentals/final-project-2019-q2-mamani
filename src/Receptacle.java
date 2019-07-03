
public class Receptacle {
	
	private boolean isOnHolder;
	private boolean isEmpty;
	
	public Receptacle() {
		isOnHolder = false;
		isEmpty = true;
	}
	
	protected void setIsOnHolder(boolean isOnHolder) {
		this.isOnHolder = isOnHolder; 
	}
	
	protected boolean getIsOnHolder() {
		return isOnHolder;
	}
	
	protected void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	protected boolean getIsEmpty() {
		return isEmpty;
	}
	
	protected void fillCoffeeGrouds() {
		if(isEmpty) {
			setIsEmpty(false);
		}
	}
}
