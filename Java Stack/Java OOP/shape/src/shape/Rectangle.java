package shape;

public class Rectangle extends shape {
	private int lenght;
	private int width;
	
	
	@Override
	public double getArea() {
		
		return lenght*width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		
		return "lenght= "+lenght+ "width = "+width;
	}
	
	

}
