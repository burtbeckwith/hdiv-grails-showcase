package org.hdiv.samples.mvc.controllers

import org.hdiv.samples.mvc.bean.Account
import org.hdiv.samples.mvc.logic.AttacksExampleFacade
import org.springframework.dao.DataAccessException

/**
 * Controls the workflow of the SQLInjection vulnerability example.
 *
 * SQL injection is an attack made to a database-driven site.
 *
 * It occurs when an attacker inserts SQL code in a form field. This results in
 * the potential manipulation of the statements performed on the database by the
 * end-user of the application.
 */
class SqlStringInjectionController {

	static allowedMethods = [processSQLStringInjection: 'POST']

	AttacksExampleFacade attacksExampleFacade

	def prepareSQLInjection() {
		render view: '/attacks/SQLInjection/SQLStringInjection', model: [account: new Account()]
	}

	/**
	 * Gets the users Account list and sends it to the view.
	 */
	def processSQLStringInjection(Account account) {

		if (account.hasErrors()) {
			render view: '/attacks/SQLInjection/SQLStringInjection', model: [account: account]
			return
		}

		def model = [:]
		try {
			List<Account> localList = attacksExampleFacade.getUserAccount(account.getUserId())
			model.userAccounts = localList
		}
		catch (DataAccessException localSQLException) {
			model.sqlMessage = localSQLException.message
		}

		render view: '/attacks/SQLInjection/ListStringInjection', model: model
	}
}
