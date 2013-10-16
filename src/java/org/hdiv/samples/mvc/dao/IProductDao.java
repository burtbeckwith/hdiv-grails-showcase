package org.hdiv.samples.mvc.dao;

import java.util.List;

import org.hdiv.samples.mvc.bean.Product;

public interface IProductDao {
	/**
	 * Gets a list of products of the 'paramString' category
	 *
	 * @param paramString
	 * @return List<Category>
	 */
	List<Product> getProductListByCategory(String paramString);
}
