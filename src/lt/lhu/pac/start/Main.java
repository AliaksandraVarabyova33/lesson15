package lt.lhu.pac.start;

import lt.lhu.pac.entity.Fridge;
import lt.lhu.pac.entity.Product;
import lt.lhu.pac.logic.FridgeLogic;
import lt.lhu.pac.view.FridgePrinter;
import lt.lhu.pac.view.ProductPrinter;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product("Orange", "Fruits", 10);
		Product product2 = new Product("Carrot", "Vegetables", 5);
		Product product3 = new Product("Chicken", "Meat", 15);

		Fridge fridge = Fridge.getFridge();

		FridgeLogic.addProduct(fridge, product1);
		FridgeLogic.addProducts(fridge, product2, product3);

		FridgePrinter.printProducts(fridge);

		ProductPrinter.printProduct(FridgeLogic.getProductWithTheBiggestWeight(fridge));

		FridgeLogic.deleteProduct(fridge, product2);

		FridgePrinter.printProducts(fridge);

		FridgeLogic.deleteProduct(fridge, product1);
		FridgeLogic.deleteProduct(fridge, product3);
		FridgeLogic.deleteProduct(fridge, product1);

	}

}
