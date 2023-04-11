package lt.lhu.pac.view;

import lt.lhu.pac.entity.Product;

public class ProductPrinter {

	public static void printProduct(Product product) {
		System.out.println(product.toString());
		System.out.println("----------------------------------------------------------");
	}

}
