package test;

public  class Galaxy extends Phone implements Ringable  {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	@Override
	public String ring() {
		
		return this.getRingTone();
	}

	@Override
	public String unlock() {
		
		return "unlock galaxy";
	}

	@Override
	public void displayInfo() {
		System.out.println("VersionNumber: "+this.getVersionNumber()+"carrier :"+this.getCarrier());
		
	}

}
