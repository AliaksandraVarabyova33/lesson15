package lt.lhu.pac.logic;

import java.util.List;

import lt.lhu.pac.entity.Fridge;
import lt.lhu.pac.entity.Product;

public class FridgeLogic {

	private static int numberOfProductsInFridge = 0;

	public static void addProduct(Fridge fridge, Product product) {

		fridge.getProducts().add(product);
		numberOfProductsInFridge++;

	}
	
	public static void addProducts(Fridge fridge, Product... products) {

		for (Product product: products) {
			fridge.getProducts().add(product);
			numberOfProductsInFridge++;
		}
		
	}

	public static void deleteProduct(Fridge fridge, Product product) {

		if (numberOfProductsInFridge <= 0) {
			System.out.println("Delete operation is declined. There are no products in the fridge.");
		} else {
			fridge.getProducts().remove(product);
			numberOfProductsInFridge--;
		}

	}

	public static boolean productIsInFridge(Fridge fridge, Product product) {
		boolean isInFridge = false;

		if (fridge.getProducts().contains(product)) {
			return true;
		}

		return isInFridge;

	}

	public static Product getProductWithTheBiggestWeight(Fridge fridge) {
		List<Product> products = fridge.getProducts();
		Product theBiggestProduct = products.get(0);

		for (Product product : products) {
			if (product.getWeight() > theBiggestProduct.getWeight()) {
				theBiggestProduct = product;
			}
		}

		return theBiggestProduct;
	}

}
