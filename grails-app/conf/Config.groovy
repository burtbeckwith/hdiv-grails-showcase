//grails.config.locations = ["classpath:${appName}-config.groovy", "file:./${appName}-config.groovy"]
//if (System.properties["${appName}.config.location"]) {
//	grails.config.locations << "file:" + System.properties["${appName}.config.location"]
//}

grails.controllers.defaultScope = 'singleton'
grails.converters.encoding = 'UTF-8'
grails.enable.native2ascii = true
grails.exceptionresolver.params.exclude = ['password']
grails.hibernate.cache.queries = false
grails.json.legacy.builder = false
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [
	all:           '*/*',
	atom:          'application/atom+xml',
	css:           'text/css',
	csv:           'text/csv',
	form:          'application/x-www-form-urlencoded',
	html:          ['text/html','application/xhtml+xml'],
	js:            'text/javascript',
	json:          ['application/json', 'text/json'],
	multipartForm: 'multipart/form-data',
	rss:           'application/rss+xml',
	text:          'text/plain',
	hal:           ['application/hal+json','application/hal+xml'],
	xml:           ['text/xml', 'application/xml']
]
grails.project.groupId = appName
grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']
grails.scaffolding.templates.domainSuffix = ''
grails.views.default.codec = 'html'
grails.web.disable.multipart=false

grails {
	views {
		gsp {
			encoding = 'UTF-8'
			htmlcodec = 'xml'
			codecs {
				expression = 'html'
				scriptlet = 'html'
				taglib = 'none'
				staticparts = 'none'
			}
		}
		filteringCodecForContentType {
			//'text/html' = 'html'
		}
	}
}

environments {
	development {
		grails.logging.jul.usebridge = true
	}
	production {
		grails.logging.jul.usebridge = false
	}
}

log4j = {
	error 'org.codehaus.groovy.grails',
	      'org.springframework',
	      'org.hibernate',
	      'net.sf.ehcache.hibernate'
	debug 'org.hibernate.SQL'
//	trace 'org.hibernate.type.descriptor.sql.BasicBinder'
	info 'org.hdiv.logs'
}



grails.dbconsole.enabled = true
grails.spring.bean.packages = ['org.hdiv.samples.mvc']
grails.sitemesh.default.layout = 'main'
grails.web.linkGenerator.useCache = false // TODO needed?

grails.plugin.springsecurity.userLookup.userDomainClassName = 'auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'auth.UserRole'
grails.plugin.springsecurity.authority.className = 'auth.Role'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = false
grails.plugin.springsecurity.rejectIfNoRule = false

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                              ['permitAll'],
	'/index':                         ['permitAll'],
	'/index.gsp':                     ['permitAll'],
	'/**/js/**':                      ['permitAll'],
	'/**/css/**':                     ['permitAll'],
	'/**/images/**':                  ['permitAll'],
	'/**/favicon.ico':                ['permitAll'],
	'/authenticated/**': ['ROLE_USER']
]

grails {
	plugin {
		hdiv {

			config {
				excludedExtensions = 'css,png,ico'
				startPages = [ANY: '/attacks/.*,/grails-errorhandler,/login/*', GET: '/,/logout/*', POST: '/j_spring_security_check']
				paramsWithoutValidation = [[url: '/.+', parameters: 'Submit']]
			}

			validations = [[id: 'safeText', acceptedPattern: '^[a-zA-Z0-9@.\\-_]*$']]

			editableValidations = [
				[id: 'editableParametersValidations', registerDefaults: true,
				 validationRules: [[url: '/secure/.*', enableDefaults: true,  validationIds: 'safeText'],
				                   [url: '/safetext/.*', enableDefaults: false, validationIds: 'safeText']]
				]
			]
		}
	}
}

// Configure the constraint for add the models
grails.gorm.default.constraints = {
	'*'(editableValidation: true)
}
