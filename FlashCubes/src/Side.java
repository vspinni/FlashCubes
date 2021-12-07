/*
 * A Side class. It will act as a container for the various types of sides 
 * that could exist within a FC object. We use generic types (T) to specify that a Side
 * could consist of text, an image, a video, etc.
 */
public class Side<T> {
	private T information;
	
	//Constructor
	public Side(T info) {
		this.information = info;
	}
	
	
	//Getters, setters, and toString()
	
	
	public void setInformation(T information) {
		this.information = information;
	}
	
	
	public T getInformation() {
		return this.information;
	}
	
	
	public String toString() {
		return (String) this.information;
	}
	
}
