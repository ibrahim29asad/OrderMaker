package edu.ucalgary.ensf409;
/**
 * @author Ibrahim Asad <a
 * href="mailto: ibrahim.asad@ucalgary.ca">ibrahim.asad@ucalgary.ca</a>
 * 
 * @author Vrund Patel <a
 * href="mailto: vrund.patel@ucalgary.ca">vrund.patel@ucalgary.ca</a>
 * 
 * @author Brian Chen <a
 * href="mailto: brian.chen@ucalgary.ca">brian.chen@ucalgary.ca</a>
 * 
 * @author Thessalonika Magadia <a
 * href="mailto: thessalonika.magadia@ucalgary.ca">thessalonika.magadia@ucalgary.ca</a>
 * 
 * @version 1.2
 * 
 * @since 1.0
 * 
 * Go to main to see instructions about running the code!
 * 
 */
public class Lamp {
	private String ID = null;
	private String type = null;
	private String base = null;
	private String bulb = null;
	private int price;
	
	Lamp(){
		
	}
	public void setID (String id) {
		this.ID = id;
	}
	public void setType (String type) {
		this.type = type;
	}
	public void setBase (String base) {
		this.base = base;
	}
	public void setBulb (String bulb) {
		this.bulb = bulb;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	
	public String getID () {
		return this.ID;
	}
	public String getType () {
		return this.type;
	}
	public String getBase () {
		return this.base;
	}
	public String getBulb () {
		return this.bulb;
	}
	public int getPrice () {
		return this.price;
	}
        
	public void printChair() {
		System.out.print("id: " + this.ID);
		System.out.print(", type: " + this.type);
		System.out.print(", base: " + this.base);
		System.out.print(", bulb: " + this.bulb);
		System.out.println(", price: "+ this.price);
	}
}