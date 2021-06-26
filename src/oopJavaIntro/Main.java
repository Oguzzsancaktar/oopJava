package oopJavaIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Product product5 = new Product(5 , "test 5 ", 1700, "detail 5" );
		
		Product product1 = new Product(); // instance , referance creation
		product1.id = 1;
		product1.name = "test 1";
		product1.unitPrice = 15000;
		product1.detail = "Test Detail";
		
		Product product2 = new Product(); // instance , referance creation
		product2.id = 2;
		product2.name = "test 2 ";
		product2.unitPrice = 15000;
		product2.detail = "Test Detail";
		
		Product product3 = new Product(); // instance , referance creation
		product3.id = 3;
		product3.name = "test 3";
		product3.unitPrice = 15000;
		product3.detail = "Test Detail";
		
		Product product4 = new Product(); // instance , referance creation
		product4.id = 4;
		product4.name = "test 4";
		product4.unitPrice = 15000;
		product4.detail = "Test Detail";
		
		product5.name = "owerride p5 name";
		Product[] products = {
				product1,
				product2,
				product5,
				product4,
				product3
				
		};
		
		for (Product product : products) {
			System.out.println(product.id);
		}
		
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "C1";
		
		Category category2 = new Category();
		category1.id = 2;
		category1.name = "C2";
		
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product5);
		
		
		
		
		
		
	}

}
