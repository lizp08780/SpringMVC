package com.lizp.springmvc.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

@WebFilter(filterName = "logFilter", urlPatterns = "/*", initParams = {
		@WebInitParam(name = "exclusions", value = ".js,.gif,.jpg,.bmp,.png,.css,.ico,.json")// 忽略资源
})
public class LogFilter extends OncePerRequestFilter {
	private final static Logger logger = LoggerFactory.getLogger(LogFilter.class);
	private String exclusions;
	private String[] exclusionArr;

	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		String url = request.getRequestURI();
		if (exclusionArr != null && exclusionArr.length != 0) {
			for (String exclusion : exclusionArr) {
				if (StringUtils.endsWith(url, exclusion)) {
					return true;
				}
			}
		}
		return super.shouldNotFilter(request);
	}

	@Override
	protected void initFilterBean() throws ServletException {
		super.initFilterBean();
		exclusionArr = StringUtils.split(exclusions, ",");
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		logger.info("============begin================{}", request.getRequestURI());
		filterChain.doFilter(request, response);
		logger.info("============end================{}", request.getRequestURI());
	}

	public String getExclusions() {
		return exclusions;
	}

	public void setExclusions(String exclusions) {
		this.exclusions = exclusions;
	}

}
