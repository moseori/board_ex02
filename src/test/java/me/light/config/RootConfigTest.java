package me.light.config;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class, ServiceConfig.class })
@WebAppConfiguration
public class RootConfigTest {
	@Autowired
	DataSource dataSource;

	@Autowired
	SqlSessionFactory ss;

	@Test
	public void dataSourceTest() {
		assertNotNull(dataSource);
	}

	@Test
	public void sqlSesstionTest() {
		assertNotNull(ss);
	}

}