
public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('T');
		AbstractDisplay d2 = new StringDisplay("Hello, String");
		AbstractDisplay d3 = new StringDisplay("안녕 방가비!");

		d1.display();	
		d2.display();	
		d3.display();	

	}
}
