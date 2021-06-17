package shape;

public  abstract class shape {
	
	private String color;
	
	public abstract double getArea();
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color;
		
	}
	

}
