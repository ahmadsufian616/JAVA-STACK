package javaopp;

public class Dog extends Animal {
	String type="Mammal";
	

public Dog() {
	super("animal");
	System.out.println("i am dog (const Dog)");
}	
	
	
@Override
public void display() {
	
	System.out.println("here is dog class");
}
public void printmassage() {
	this.display();
	super.display();
}
public void printtype() {
	System.out.println("this dog type :"+this.type);
	System.out.println("this Animal type :"+super.type);
	
	
}

}
