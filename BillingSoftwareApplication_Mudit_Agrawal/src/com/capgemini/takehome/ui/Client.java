package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.exception.ProductNotAvailable;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {

	public static void main(String[] args) throws ProductNotAvailable {
		
		IProductService iProductService = new ProductService();
		int n;
		int productCode;
		int quantity;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1) Generate Bill by entering Product code and quantity");
			System.out.println("2) Exit");
			n = scanner.nextInt();
			scanner.nextLine();
			switch(n)
			{
			
			case 1: 
					System.out.println("Enter the product code");
					productCode = scanner.nextInt();
					int temp = productCode/1000;
					if(temp==0 || temp > 9)
					{
						System.out.println("Product code should be of 4 digits");
						break;
					}
					System.out.println("Enter the quantity");
					quantity = scanner.nextInt();
					if(quantity <= 0)
					{
						System.out.println("Quantity should not be lesser than or equal to zero");
						break;
					}
					try
					{
					if(iProductService.getProductDetails(productCode)!=null)
					{
						System.out.println("Product Name: "+ iProductService.getProductDetails(productCode).getProductName());
						System.out.println("Product Category: "+ iProductService.getProductDetails(productCode).getProductCategory());
						System.out.println("Product Price (Rs): "+ iProductService.getProductDetails(productCode).getProductPrice());
						System.out.println("Quantity: "+ quantity);
						System.out.println("Line Total (Rs): "+ quantity*iProductService.getProductDetails(productCode).getProductPrice());
					}
					}
					catch(ProductNotAvailable PNA)
					{
						System.out.println("Sorry ! The Product Code "+productCode+" is not available");
					}
					
					break;
					
			case 2: System.exit(0);
			
			default: System.out.println("You have entered a wrong choice");
			}
		}

	}

}
