package org.hdiv.samples.mvc.controllers

import org.hdiv.samples.mvc.bean.Message

/**
 * Controls the workflow of the Cross Site Scripting vulnerability example.
 *
 * XSS occurs when an attacker uses a web application to send malicious code,
 * generally in the form of a script, to a different end user.
 *
 * These flaws are quite widespread and occur anywhere a web application uses
 * input from a user in the output it generates without validating it.
 */
class XssController {

	def prepareXSS() {
		render view: '/attacks/xss/xss', model: [message: new Message()]
	}

	/**
	 * Gets the message sent by the user and passes it to the view.
	 */
	def xssResult(Message message) {
		if (message.hasErrors()) {
			render view: '/attacks/xss/xss', model: [message: message]
			return
		}

		render view: '/attacks/xss/xssResults', model: [message: message.msgText]
	}
}
