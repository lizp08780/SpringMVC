package com.lizp.springmvc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({"classpath*:context/spring-mvc-servlet.xml", "classpath*:spring.xml"})
public class BaseJunit4Test {
}
