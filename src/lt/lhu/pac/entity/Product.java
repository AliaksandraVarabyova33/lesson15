package lt.lhu.pac.entity;

import java.util.Objects;

public class Product {
	
	private String name;
	private String category;
	private int weight;
	
	public Product(String name, String category, int weight) {
		super();
		this.name = name;
		this.category = category;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(name, other.name) && weight == other.weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", weight=" + weight + "]";
	}
	
}
