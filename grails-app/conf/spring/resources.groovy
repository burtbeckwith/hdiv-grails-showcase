import grails.GrailsDatabasePopulator

import org.springframework.jdbc.core.JdbcTemplate

beans = {

	jdbcTemplate(JdbcTemplate) {
		dataSource = ref('dataSource')
	}

	databasePopulator(GrailsDatabasePopulator) {
		dataSource = ref('dataSource')
		scripts = ['classpath:db/schema.sql', 'classpath:db/dataload.sql']
	}
}
