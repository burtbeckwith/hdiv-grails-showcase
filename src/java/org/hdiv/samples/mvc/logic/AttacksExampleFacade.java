package org.hdiv.samples.mvc.logic;

import java.util.List;

import org.hdiv.samples.mvc.bean.Account;
import org.hdiv.samples.mvc.bean.Category;
import org.hdiv.samples.mvc.bean.Order;
import org.hdiv.samples.mvc.bean.Product;

public interface AttacksExampleFacade {

	List<Account> getUserAccount(String paramString);

	List<Order> getOrdersByUsername(String paramString);

	List<Order> getNotPaidOrdersByUsername(String paramString);

	List<Order> getPaidOrdersByUsername(String paramString);

	Order getOrderById(String userid, int orderId);

	void updateOrder(Order order);

	List<Category> getCategoryList();

	List<Product> getProductListByCategory(String paramString);
}
