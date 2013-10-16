package org.hdiv.samples.mvc.bean

import grails.validation.Validateable

@Validateable
class Order implements Serializable {
	int orderId
	String username
	Date orderDate
	String shipAddress1
	String shipAddress2
	String shipCity
	String shipState
	String shipZip
	String shipCountry
	String billAddress1
	String billAddress2
	String billCity
	String billState
	String billZip
	String billCountry
	String courier
	double totalPrice
	String billToFirstName
	String billToLastName
	String shipToFirstName
	String shipToLastName
	String creditCard
	String expiryDate
	String cardType
	String locale
	String status
	List lineItems = []
	boolean paid
}
