package lab3;
// this does the same as house
public class Apartment extends Dwelling{
	private String apptNum;	
	private boolean laundry;
	
	public Apartment() {
		super();
		apptNum = "";
		laundry = false;
	}

	
	
 	public String getApptNum() {
		return apptNum;
	}

	public void setApptNum(String apptNum) {
		this.apptNum = apptNum;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}
	// toString method but the inheritance is utilized as well here by the dwelling program
@Override	
		public String toString() {
			return super.toString() + "|" + apptNum + "|" + laundry;

	}
}
