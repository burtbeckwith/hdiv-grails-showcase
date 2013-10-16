package org.hdiv.samples.mvc.logic;

import java.util.List;

import org.hdiv.samples.mvc.bean.Account;
import org.hdiv.samples.mvc.bean.Category;
import org.hdiv.samples.mvc.bean.Order;
import org.hdiv.samples.mvc.bean.Product;
import org.hdiv.samples.mvc.dao.IAccountDao;
import org.hdiv.samples.mvc.dao.ICategoryDao;
import org.hdiv.samples.mvc.dao.IOrderDao;
import org.hdiv.samples.mvc.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("attacksExampleFacade")
public class AttacksImpl implements AttacksExampleFacade {

	@Autowired
	private IAccountDao accountDao;

	@Autowired
	private ICategoryDao categoryDao;

	@Autowired
	private IProductDao productDao;

	@Autowired
	private IOrderDao orderDao;

	public void setAccountDao(IAccountDao paramIAccountDao) {
		accountDao = paramIAccountDao;
	}

	public void setCategoryDao(ICategoryDao paramICategoryDao) {
		categoryDao = paramICategoryDao;
	}

	public void setProductDao(IProductDao paramIProductDao) {
		productDao = paramIProductDao;
	}

	public void setOrderDao(IOrderDao paramIOrderDao) {
		orderDao = paramIOrderDao;
	}

	public List<Account> getUserAccount(String paramString) {
		return accountDao.getUserAccount(paramString);
	}

	public List<Order> getOrdersByUsername(String paramString) {
		return orderDao.getOrdersByUsername(paramString);
	}

	public List<Order> getNotPaidOrdersByUsername(String paramString) {
		return orderDao.getNotPaidOrdersByUsername(paramString);
	}

	public List<Order> getPaidOrdersByUsername(String paramString) {
		return orderDao.getPaidOrdersByUsername(paramString);
	}

	public List<Category> getCategoryList() {
		return categoryDao.getCategoryList();
	}

	public List<Product> getProductListByCategory(String paramString) {
		return productDao.getProductListByCategory(paramString);
	}

	public Order getOrderById(String userid, int orderId) {
		return orderDao.getOrderById(userid, orderId);
	}

	public void updateOrder(Order order) {
		orderDao.updateOrder(order);
	}
}
