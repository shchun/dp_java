
public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeTitle("Morning and Day");

		builder.makeItems(new String[] { 
			"Good morning.", 
			"Good night.", 
			"Good bye.",
		});

		builder.close();
	}
}
