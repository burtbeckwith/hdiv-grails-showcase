package org.hdiv.samples.tag

import org.codehaus.groovy.grails.web.mapping.LinkGenerator

// workarounds for Grails not handling link building when you don't use controllers/actions/etc.
class ShowcaseTagLib {

	static namespace = 'showcase'

	static returnObjectForTags = ['relativeUri']

	def relativeLink = { attrs, body ->

		out <<  '<a href=\"'
		out << relativeUri(attrs)
		out << '"'

		def remainingKeys = attrs.keySet() - LinkGenerator.LINK_ATTRIBUTES
		for (key in remainingKeys) {
			out << " " << key << "=\"" << attrs[key]?.encodeAsHTML() << "\""
		}
		out << '>'

		out << body()

		out << '</a>'
	}

	def relativeUri = { attrs ->
		String currentUri = request.forwardURI.substring(request.contextPath.length())
		attrs.uri = currentUri.substring(0, currentUri.lastIndexOf('/')) + '/' + attrs.uri

		StringBuilder link = new StringBuilder(createLink(attrs).encodeAsHTML())
		if (attrs.params) {
			link << '?'
			link << attrs.params.collect { it.key.encodeAsHTML() + '=' + it.value.encodeAsHTML() }.join('&')
		}

		link.toString()
	}
}
