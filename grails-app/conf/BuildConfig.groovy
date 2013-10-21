grails.servlet.version = '3.0'
grails.project.work.dir = 'target'
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
	inherits 'global'
	log 'warn'
	checksums true
	legacyResolve false

	repositories {
		inherits true

		grailsPlugins()
		grailsHome()
		mavenLocal()
		grailsCentral()
		mavenCentral()

		mavenRepo 'http://repo.spring.io/milestone' // TODO remove
	}

	dependencies {}

	plugins {
		build ':tomcat:7.0.42'
		compile ':scaffolding:2.0.0'
		compile ':cache:1.1.1'
		runtime ':hibernate:3.6.10.2'
		runtime ':jquery:1.10.2'
		runtime ':resources:1.2'

		runtime ':spring-security-core:2.0-RC2'
		compile ':hdiv:1.0-RC2'
	}
}
