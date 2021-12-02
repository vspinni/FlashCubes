/*
 * A Side class. It will act as a container for the various types of sides 
 * that could exist within a FC object
 */
public class Side<T> {
	private T information;
	
	public Side(T info) {
		this.information = info;
	}
	
	
	public void setInformation(T information) {
		this.information = information;
	}
	
	
	public T getInformation() {
		return this.information;
	}
	
}
