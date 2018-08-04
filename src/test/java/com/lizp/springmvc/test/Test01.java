package com.lizp.springmvc.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lizp.springmvc.BaseJunit4Test;
import com.lizp.springmvc.service.ITxChannelService;

public class Test01 extends BaseJunit4Test {
	@Autowired
	private ITxChannelService txChannelService;

	@Test
	public void test_queryBindCard() {
		txChannelService.selectById("123", "456");
	}

}
