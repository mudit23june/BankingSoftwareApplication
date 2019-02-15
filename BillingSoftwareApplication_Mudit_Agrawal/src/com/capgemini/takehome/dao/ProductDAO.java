package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotAvailable;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO{

	CollectionUtil collectionUtil = new CollectionUtil();
	@SuppressWarnings("static-access")
	public Product getProductDetails(int productCode) throws ProductNotAvailable
	{
		if(collectionUtil.getProducts(productCode)!=null)
			return collectionUtil.getProducts(productCode);
		else
			throw new ProductNotAvailable();
		
	}
}
