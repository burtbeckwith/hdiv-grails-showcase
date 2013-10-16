package org.hdiv.samples.mvc.bean

import grails.validation.Validateable

import org.springframework.web.multipart.MultipartFile

@Validateable
class MultipartBean {
	MultipartFile file
	String name
	String search
}
