package lt.lhu.pac.view;

import lt.lhu.pac.entity.Fridge;
import lt.lhu.pac.entity.Product;

public class FridgePrinter {

	public static void printProducts(Fridge fridge) {
		for (Product product : fridge.getProducts()) {
			System.out.println(product.toString());
		}
		System.out.println("----------------------------------------------------------");
	}

}
