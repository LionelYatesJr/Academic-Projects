package lab3;
// House gains information from dwelling to extend it
public class House extends Dwelling{
	private double acreage;
	private int garageSize;
 	
	public House() {
		super();
		acreage = 0;
		garageSize = 0;
	}
	

	
	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

	public int getGarageSize() {
		return garageSize;
	}

	public void setGarageSize(int garageSize) {
		this.garageSize = garageSize;
	}
	// to string method but the inheritance method "super" allows me to get the toString from dwelling and utilize that
@Override
public String toString() {
	return super.toString() + "|" + acreage + "|" + garageSize;
	
}

}
