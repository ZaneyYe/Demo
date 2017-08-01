package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.NoticeService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


/**
 * Created by yzy on 2017/06/21 上午 11:11.
 * email: mia5121@163.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@Resource
	private NoticeService noticeService;

	@RequestMapping("/index.do")
	public String toIndex(HttpServletRequest request, HttpServletResponse response,Map<String,Object> dataMap){
		LOGGER.info("coming over");
		request.setAttribute("name","china");
		dataMap.put("shit","fuck");
//		noticeService.notice();
		return "hello";
	}


}
