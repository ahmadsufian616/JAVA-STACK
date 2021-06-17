package algorthem;
import java.lang.Comparable;

public class Author implements Comparable<Author>{
	String First_name;
	String Last_name;
	String Book_name;

	@Override
	public int compareTo(Author o) {
		return this.First_name.compareTo(o.First_name);
		
	}
	

}
