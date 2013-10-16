package org.hdiv.samples.mvc.controllers

import org.hdiv.samples.mvc.bean.Order
import org.hdiv.samples.mvc.logic.AttacksExampleFacade

/**
 * Controls the workflow of the Auto Binding vulnerability example.
 *
 * Auto Binding vulnerability occurs when an attackers exploits a field that
 * does not exist in the form. Then, Spring will make an auto binding and fill
 * the commands field sending it to the controller as it was a form field.
 */
class AutoBindingController {

	static allowedMethods = [processAutoBinding: 'GET', updateAutoBinding: 'POST']

	AttacksExampleFacade attacksExampleFacade

	def prepareAutoBinding() {
		render view: '/attacks/autoBinding/AutoBinding'
	}

	/**
	 * Passes the paid and unpaid orders lists to the view.
	 */
	def processAutoBinding(String username) {
		List<Order> notPaidList = attacksExampleFacade.getNotPaidOrdersByUsername(username)
		List<Order> paidList = attacksExampleFacade.getPaidOrdersByUsername(username)

		render view: '/attacks/autoBinding/ListAutoBinding',
		       model: [orderList: notPaidList, paidOrderList: paidList]
	}

	/**
	 * Gets the order selected by the user, and passes to the view.
	 */
	def modifyAutoBinding(String userid, Integer idOrder) {
		Order order = attacksExampleFacade.getOrderById(userid, idOrder)
		render view: '/attacks/autoBinding/ModifyAutoBinding', model: [order: order]
	}

	/**
	 * Updates an order.
	 */
	def updateAutoBinding(Order order) {
		attacksExampleFacade.updateOrder(order)
		render view: '/attacks/autoBinding/ModifyResult'
	}
}
