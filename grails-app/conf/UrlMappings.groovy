import org.springframework.dao.DataAccessException
import org.springframework.transaction.TransactionException

class UrlMappings {

	static mappings = {

		"/"(view: '/index')

		"/welcome.html"(view: '/welcome')
		"/attacks/attacks.html"(view: '/attacks/attacks')
		"/secure/attacks.html"(view: '/attacks/attacks')
		"/authenticated/info.html"(view: '/authenticated/info')

		"/attacks/autoBinding/prepareAutoBinding.html"(controller: 'autoBinding', action: 'prepareAutoBinding')
		"/secure/autoBinding/prepareAutoBinding.html"(controller: 'autoBinding', action: 'prepareAutoBinding')

		"/attacks/autoBinding/processAutoBinding.html"(controller: 'autoBinding', action: 'processAutoBinding')
		"/secure/autoBinding/processAutoBinding.html"(controller: 'autoBinding', action: 'processAutoBinding')

		"/attacks/autoBinding/modifyAutoBinding/$userid/${idOrder}.html"(controller: 'autoBinding', action: 'modifyAutoBinding')
		"/secure/autoBinding/modifyAutoBinding/$userid/${idOrder}.html"(controller: 'autoBinding', action: 'modifyAutoBinding')

		"/attacks/autoBinding/updateAutoBinding.html"(controller: 'autoBinding', action: 'updateAutoBinding')
		"/secure/autoBinding/updateAutoBinding.html"(controller: 'autoBinding', action: 'updateAutoBinding')

		"/attacks/xss/prepareXSS.html"(controller: 'xss', action: 'prepareXSS')
		"/secure/xss/prepareXSS.html"(controller: 'xss', action: 'prepareXSS')

		"/attacks/xss/processXSS.html"(controller: 'xss', action: 'xssResult')
		"/secure/xss/processXSS.html"(controller: 'xss', action: 'xssResult')

		"/attacks/SQLInjection/prepareSQLInjection.html"(controller: 'sqlStringInjection', action: 'prepareSQLInjection')
		"/secure/SQLInjection/prepareSQLInjection.html"(controller: 'sqlStringInjection', action: 'prepareSQLInjection')

		"/attacks/SQLInjection/processSQLStringInjection.html"(controller: 'sqlStringInjection', action: 'processSQLStringInjection')
		"/secure/SQLInjection/processSQLStringInjection.html"(controller: 'sqlStringInjection', action: 'processSQLStringInjection')

		"/attacks/parameterTampering/prepareSelectFieldTampering.html"(controller: 'parameterTampering', action: 'prepareSelectFieldTampering')
		"/secure/parameterTampering/prepareSelectFieldTampering.html"(controller: 'parameterTampering', action: 'prepareSelectFieldTampering')

		"/attacks/parameterTampering/prepareHiddenFieldTampering.html"(controller: 'parameterTampering', action: 'prepareHiddenFieldTampering')
		"/secure/parameterTampering/prepareHiddenFieldTampering.html"(controller: 'parameterTampering', action: 'prepareHiddenFieldTampering')

		"/attacks/parameterTampering/prepareLinkTampering.html"(controller: 'parameterTampering', action: 'prepareLinkTampering')
		"/secure/parameterTampering/prepareLinkTampering.html"(controller: 'parameterTampering', action: 'prepareLinkTampering')

		"/attacks/parameterTampering/processListOrdersSelect.html"(controller: 'parameterTampering', action: 'processListOrdersSelect')
		"/secure/parameterTampering/processListOrdersSelect.html"(controller: 'parameterTampering', action: 'processListOrdersSelect')

		"/attacks/parameterTampering/processListOrdersHidden.html"(controller: 'parameterTampering', action: 'processListOrdersHidden')
		"/secure/parameterTampering/processListOrdersHidden.html"(controller: 'parameterTampering', action: 'processListOrdersHidden')

		"/attacks/parameterTampering/processListOrdersLink.html"(controller: 'parameterTampering', action: 'processListOrdersLink')
		"/secure/parameterTampering/processListOrdersLink.html"(controller: 'parameterTampering', action: 'processListOrdersLink')


		"/fileupload/fileupload.html"(controller: 'fileUpload', action: 'prepareIndex')

		"/fileupload/simple.html"(controller: 'fileUpload') {
			action = [GET: 'prepareSimple', POST: 'processSimple']
		}

		"/fileupload/binding.html"(controller: 'fileUpload') {
			action = [GET: 'prepareBinding', POST: 'processBinding']
		}


		"/logout/$action?"(controller: 'logout')
		"/login/$action?"(controller: 'login')

		"404"(controller: 'errors', action: 'notFound')

		"500"(view:'/error')
		"500"(view: '/dataAccessFailure', exception: DataAccessException)
		"500"(view: '/dataAccessFailure', exception: TransactionException)
	}
}
