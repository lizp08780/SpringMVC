package com.lizp.springmvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.lizp.springmvc.BaseJunit4Test;
import com.lizp.springmvc.service.ITxChannelService;

public class Test01 extends BaseJunit4Test {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Autowired
	private ITxChannelService txChannelService;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void index() throws Exception {
		this.mockMvc
				.perform(MockMvcRequestBuilders.get("/txChannel/getTxChannel")
						.contentType(MediaType.APPLICATION_JSON_UTF8).param("channelSerialNo", "12"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn()
				.getResponse().getContentAsString();
	}

	@Test
	public void test_selectById() {
		txChannelService.selectById("12", "34");
	}

}
