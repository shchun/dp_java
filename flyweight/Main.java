
public class Main {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Usage: java Main digits");
			System.exit(0);
		}

		BigString bc = new BigString(args[0]);
		bc.print();

	}

}
