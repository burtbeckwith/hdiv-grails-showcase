package org.hdiv.samples.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hdiv.samples.mvc.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao implements IProductDao {

	private Log log = LogFactory.getLog(getClass());

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Product> getProductListByCategory(String paramString) {
		String str = "select * from product where category='" + paramString + "'";
		if (log.isInfoEnabled()) {
			log.info("sql:" + str);
		}
		RowMapper<Product> rowMapper = new RowMapper<Product>() {
			public Product mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
				Product localProduct = new Product();
				localProduct.setProductId(paramResultSet.getString("productId"));
				localProduct.setName(paramResultSet.getString("name"));
				localProduct.setDescription(paramResultSet.getString("descn"));
				localProduct.setCategoryId(paramResultSet.getString("category"));
				return localProduct;
			}
		};
		return jdbcTemplate.query(str, rowMapper);
	}

	public void setJdbcTemplate(JdbcTemplate paramJdbcTemplate) {
		jdbcTemplate = paramJdbcTemplate;
	}
}
