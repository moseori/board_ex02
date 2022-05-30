package me.light.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import me.light.config.RootConfig;
import me.light.config.ServiceConfig;
import me.light.model.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class,ServiceConfig.class})
@WebAppConfiguration
public class BoardMapperTest {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void getListTest() {
		List<Board> list=mapper.getList();
		assertEquals(4, list.size());
	}

}
