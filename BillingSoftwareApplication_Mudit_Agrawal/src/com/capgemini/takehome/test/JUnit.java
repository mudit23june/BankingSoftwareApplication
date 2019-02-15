package com.capgemini.takehome.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.ProductNotAvailable;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class JUnit {

	IProductDAO iProductDAO = new ProductDAO();
	IProductService iProductService = new ProductService(iProductDAO);
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test(expected=com.capgemini.takehome.exception.ProductNotAvailable.class)
	public void test() throws ProductNotAvailable {
		iProductService.getProductDetails(2019);
	}
	
	@Test
	public void test2() throws ProductNotAvailable {
		iProductService.getProductDetails(1002);
	}
	
}
