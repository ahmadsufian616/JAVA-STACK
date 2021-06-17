package shape;

public class Triangle extends shape {
	private int base;
	private int height;

	@Override
	public double getArea() {
		
		return base/2*height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "base= "+base+" height= "+height;
	}

}
