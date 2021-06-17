package shape;

public class test {

	public static void main(String[] args) {
		Triangle T1= new Triangle();
		Rectangle R1= new Rectangle();
		T1.setBase(5);
		T1.setHeight(8);
		System.out.println(T1.getArea());
		R1.setLenght(5);
		R1.setWidth(10);
		System.out.println(R1.getArea());
		
	}
}
