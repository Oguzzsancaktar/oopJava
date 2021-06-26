package oopJavaIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product5 = new Product(5,"test 5 ",1700,"detail 5",10);
		
		Product product1 = new Product(); // instance , referance creation
	
		
		Product product2 = new Product(); // instance , referance creation
		product2.setId(2);
		product2.setName("Product 2");
		product2.setDetail("P2 Detail");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		
		
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Catgory 1");
		
		Category category2 = new Category();
		category1.setId(2);
		
		category1.setName("Catgory 1");
		category2.setName("Catgory 2");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
				
		
//		Product product3 = new Product(); // instance , referance creation
//		Product[] products = {
//				product1,
//				product2,
//				product3,
//	
//				
//		};
//		
//		for (Product product : products) {
//			System.out.println(product.getName());
//		}
//		
//		
//		System.out.println(products.length);
//		
//		
//		Category category1 = new Category();
//		category1.id = 1;
//		category1.name = "C1";
//		
//		Category category2 = new Category();
//		category1.id = 2;
//		category1.name = "C2";
//		
//		
//		
//		ProductManager productManager = new ProductManager();
//		
//		productManager.addToCart(product5);
		
		
		
		
		
		
	}

}
