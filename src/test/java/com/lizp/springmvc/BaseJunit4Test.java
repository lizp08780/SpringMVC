package com.lizp.springmvc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-mvc-servlet.xml")
public class BaseJunit4Test {
}
