package samplenewproject1;

public class order {
	private customer cust;
	private product Product;
	private String orderID;
	public customer getCust() {
		return cust;
	}
	public void setCust(customer cust) {
		this.cust = cust;
	}
	public product getProduct() {
		return Product;
	}
	public void setProduct(product Product) {
		this.Product = Product;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	@Override
	public String toString() {
		return "order [cust=" + cust + ", product=" + Product + ", orderID=" + orderID + "]";
	}
	
	

}
