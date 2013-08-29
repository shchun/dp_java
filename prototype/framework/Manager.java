
package framework;
import java.util.*;

public class Manager {
	private HashMap showcase = new HashMap();

	public void register(String name, Product proto) {
		System.out.println("registered : " + name);
		showcase.put (name, proto);
	}

	public Product create(String protoname) {
	//	Product p = (Product) showcase.get(protoname);
	//	return p.createClone();
		return (Product) showcase.get(protoname);
	}

}
