
package com.lizp.springmvc.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.lizp.springmvc.domain.Person;
import com.lizp.springmvc.service.ITxChannelService;

@Controller
public class HelloWorldController {
	private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	@Autowired
	private ITxChannelService txChannelService;
	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

	@RequestMapping("/hello")
	public String hello(Model model) {
		logger.info("=======================");
		model.addAttribute("greeting", "Hello Spring MVC 你好啊");
		return "helloworld";
	}

	@RequestMapping("/success")
	public String ftl(Model model) {
		logger.info("=======================");
		return "success";
	}

	@RequestMapping("/json")
	@ResponseBody
	public Person json() {
		requestMappingHandlerAdapter.getMessageConverters();
		logger.info("=========json==============");
		// int x = 1 / 0;跳转500界面
		Person person = new Person();
		person.setAge(12);
		person.setName("你爸");
		person.setCreate(new Date());
		txChannelService.selectById("1", "2");
		logger.info("=========begin==============");
		txChannelService.insertSelective(null);
		logger.info("=========end==============");
		return person;
	}

}