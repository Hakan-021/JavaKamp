package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraný";
				
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinasý");
		product1.setDiscount(7);
		product1.setUnitsInStock(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinasý");
		product2.setDiscount(7);
		product2.setUnitsInStock(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinasý");
		product3.setDiscount(7);
		product3.setUnitsInStock(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone(0554222222);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Hakan");
		individualCustomer.setLastName("Kaya");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0536333333");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};  
	}

}
