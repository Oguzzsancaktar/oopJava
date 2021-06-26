package oopJavaIntro;

public class Product {
	
	
	public Product() {
			//constructor 
		System.out.println("ım ok");
		
	}
	
	
	public Product(int id , String name, double unitPrice , String detail) {
		//constructor 
		this();
	System.out.println("ım not ok");
	
	this.id = id;
	this.name = name;
	this.unitPrice = unitPrice;
	this.detail =detail;		
	
	
}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
