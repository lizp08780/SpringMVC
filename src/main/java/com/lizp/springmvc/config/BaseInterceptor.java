package com.lizp.springmvc.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BaseInterceptor implements HandlerInterceptor {
	private final static Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);

	/**
	 * 在DispatcherServlet之前执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("************BaseInterceptor preHandle executed**********");
		return true;
	}

	/**
	 * 在controller执行之后的DispatcherServlet之后执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("************BaseInterceptor postHandle executed**********");
	}

	/**
	 * 在页面渲染完成返回给客户端之前执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("************BaseInterceptor afterCompletion executed**********");
	}

}
