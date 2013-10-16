import auth.Role
import auth.User
import auth.UserRole

class BootStrap {

	def init = { servletContext ->
		def userRole = Role.findOrSaveByAuthority('ROLE_USER')
		def adminRole = Role.findOrSaveByAuthority('ROLE_ADMIN')

		if (!User.count()) {
			def david = new User(username: 'david', password: 'david').save()
			UserRole.create david, userRole
			UserRole.create david, adminRole

			def alex = new User(username: 'alex', password: 'alex').save()
			UserRole.create alex, userRole

			def tim = new User(username: 'tim', password: 'tim').save()
			UserRole.create tim, userRole
		}
	}
}
