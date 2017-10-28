package com.v8en.studio.controller.base;


import javax.servlet.http.HttpServletRequest;

import com.v8en.studio.entity.Page;
import com.v8en.studio.util.UuidUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.v8en.studio.util.Logger;
import com.v8en.studio.util.PageData;

/**
 * @author Simon
 * 修改时间：2015、12、11
 */
public class BaseController {
	
	protected Logger logger = Logger.getLogger(this.getClass());

	/** new PageData对象
	 * @return PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**得到ModelAndView
	 * @return ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**得到request对象
	 * @return HttpServletRequest
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}

	/**得到32位的uuid
	 * @return String
	 */
	public String get32UUID(){
		return UuidUtil.get32UUID();
	}
	
	/**得到分页列表的信息
	 * @return Page
	 */
	public Page getPage(){
		return new Page();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
	
}
