package lab3;

public class Dwelling {
	
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private int bedrooms;
	private double bathrooms;
// get set method for stated classes
	public Dwelling() {
		streetAddress = "";
		city = "";
		state = "";
		zip = "";
		bedrooms = 0;
		bathrooms = 0;
		
	}
	
 	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public double getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(double bathrooms) {
		this.bathrooms = bathrooms;
	}
	// to string method to set up data information in order
@Override
public String toString() {
	
	return streetAddress + "|" + city + "|" + state + "|" + zip + "|" + bedrooms + "|" + bathrooms;  
}
	

}
