class ErrorsController {

	def notFound() {
		log.debug "could not find $request.forwardURI"
		render view: '/pageNotFound'
	}
}
