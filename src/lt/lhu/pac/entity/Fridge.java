package lt.lhu.pac.entity;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

	private static Fridge fridge;
	private List<Product> products;

	private Fridge() {
		products = new ArrayList<Product>();
	}

	public static Fridge getFridge() {
		if (fridge == null) {
			fridge = new Fridge();
		}
		return fridge;
	}

	public List<Product> getProducts() {
		return products;
	}

}
