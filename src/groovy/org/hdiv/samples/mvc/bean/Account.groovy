package org.hdiv.samples.mvc.bean

import grails.validation.Validateable

@Validateable
class Account implements Serializable {
	String userId
	String email
	String firstName
	String lastName
	String status
	String address1
	String address2
	String city
	String state
	String zip
	String country
	String phone
	String favouriteCategoryId
	String languagePreference
	boolean listOption
	boolean bannerOption
	String bannerName
}
