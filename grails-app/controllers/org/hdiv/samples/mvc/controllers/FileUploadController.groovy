package org.hdiv.samples.mvc.controllers

import org.hdiv.samples.mvc.bean.MultipartBean
import org.springframework.web.multipart.MultipartFile

/**
 * Controls the workflow of the FileUpload example.
 */
class FileUploadController {

	def prepareIndex() {
		render view: '/fileupload/fileupload'
	}

	def prepareSimple() {
		render view: '/fileupload/simple'
	}

	def processSimple() {
		MultipartFile file // TODO
		render view: '/fileupload/simple',
		       model: [message: "File '$file.originalFilename' uploaded successfully"]
	}

	def prepareBinding() {
		render view: '/fileupload/binding',
		       model: [bean: new MultipartBean()]
	}

	def processBinding(MultipartBean bean) {
		render view: '/fileupload/binding',
		       model: [message: "File '$bean.file.originalFilename' uploaded successfully. Name '$bean.name'. Search '$bean.search'"]
	}
}
