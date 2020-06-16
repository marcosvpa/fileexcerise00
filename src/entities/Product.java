package entities;

public class Product {

	String productName;
	Double productValue;
	Integer productQuantities;
	Double productTotal; 
	
	public Product(String productName, Double productValue, Integer productQuantities) {
		super();
		this.productName = productName;
		this.productValue = productValue;
		this.productQuantities = productQuantities;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductValue() {
		return productValue;
	}

	public void setProductValue(Double productValue) {
		this.productValue = productValue;
	}

	public Integer getProductQuantities() {
		return productQuantities;
	}

	public void setProductQuantities(Integer productQuantities) {
		this.productQuantities = productQuantities;
	}

	public Double getProductTotal() {
		return productTotal;
	}

	public void setProductTotal(Double productTotal) {
		this.productTotal = productTotal;
	}

	public double totalSum() {
		return productValue * productQuantities;	
	}


	public String getProductName() {
		return productName;
	}


	public String toString() {
		return "Produto: " + productName+ " Total: " + totalSum();
	}
	
}
