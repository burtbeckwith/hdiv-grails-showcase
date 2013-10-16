package grails;

import javax.sql.DataSource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.util.Assert;

public class GrailsDatabasePopulator extends ResourceDatabasePopulator implements InitializingBean {

	private DataSource dataSource;

	public void setDataSource(DataSource ds) {
		dataSource = ds;
	}

	public void afterPropertiesSet() throws Exception {
		Assert.notNull(dataSource, "dataSource is required");

		DatabasePopulatorUtils.execute(this, dataSource);
	}
}
