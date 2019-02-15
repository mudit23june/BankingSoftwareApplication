package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.ProductNotAvailable;

public class ProductService implements IProductService {

	IProductDAO iProductDAO = new ProductDAO();
	public ProductService(IProductDAO iProductDAO) {
		
		this.iProductDAO = iProductDAO;
	}
	public Product getProductDetails(int productCode) throws ProductNotAvailable
	{
		return iProductDAO.getProductDetails(productCode);
		
	}
	public ProductService() {
		super();
	}
}
