package org.hdiv.samples.mvc.bean

import grails.validation.Validateable

@Validateable
class Message implements Serializable {
	String msgText
}
