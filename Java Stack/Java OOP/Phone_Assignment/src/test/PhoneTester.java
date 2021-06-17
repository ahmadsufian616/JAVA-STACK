package test;

public class PhoneTester {
	public static void main(String[] args) {
	Galaxy s9 = new Galaxy("s9",99,"verizon","ring ring ring");
	IPhone iphone = new IPhone("x",100,"AT&A","zing");
	s9.displayInfo();
	System.out.println(s9.ring());
	System.out.println(s9.unlock());
	
	
	iphone.displayInfo();
	System.out.println(iphone.ring());
	System.out.println(iphone.unlock());

	
	
	
	
	
	
	}

}
