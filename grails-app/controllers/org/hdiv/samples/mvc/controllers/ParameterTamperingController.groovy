package org.hdiv.samples.mvc.controllers

import org.hdiv.samples.mvc.bean.Order
import org.hdiv.samples.mvc.logic.AttacksExampleFacade

/**
 * Controls the workflow of the Parameter Tampering vulnerability example.
 *
 * Parameter tampering is a simple attack targeting the application business
 * logic. This attack takes advantage of the fact that many programmers rely on
 * hidden or fixed fields (such as a hidden tag in a form or a parameter in a
 * URL) as the only security measure for certain operations. Attackers can
 * easily modify these parameters to bypass the security mechanisms that rely on
 * them.
 */
class ParameterTamperingController {

	AttacksExampleFacade attacksExampleFacade

	def prepareSelectFieldTampering() {
		render view: '/attacks/parameterTampering/SelectFieldTampering',
		       model: [order: new Order(username: 'j2ee')]
	}

	def prepareHiddenFieldTampering() {
		render view: '/attacks/parameterTampering/HiddenFieldTampering',
		       model: [order: new Order(username: 'j2ee')]
	}

	def prepareLinkTampering() {
		render view: '/attacks/parameterTampering/LinkParamTampering'
	}

	/**
	 * Get all the orders by the username and sends it to the view.
	 */
	def processListOrdersSelect(Order order) {
		List<Order> localList = attacksExampleFacade.getOrdersByUsername(order.username)
		render view: '/attacks/parameterTampering/ListOrders',
		       model: [orderList: localList, back: 'prepareSelectFieldTampering']
	}

	def processListOrdersHidden(Order order) {
		List<Order> localList = attacksExampleFacade.getOrdersByUsername(order.username)
		render view: '/attacks/parameterTampering/ListOrders',
		       model: [orderList: localList, back: 'prepareHiddenFieldTampering']
	}

	def processListOrdersLink(Order order) {
		List<Order> localList = attacksExampleFacade.getOrdersByUsername(order.username)
		render view: '/attacks/parameterTampering/ListOrders',
		       model: [orderList: localList, back: 'prepareLinkTampering']
	}
}
