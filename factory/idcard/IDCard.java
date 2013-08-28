
package idcard;

import framework.*;

public class IDCard extends Product {
	private String owner;
	IDCard(String owner) {
		System.out.println("making card of " + owner);
		this.owner = owner;
	}

	public void use() {
		System.out.println("using card of " + owner);
	}

	public String getOwner() {
		return owner;
	}
}
