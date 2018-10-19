package com.ex.lee;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ex.lee.Data;
import kr.ex.lee.VO;

@Controller
public class WriteController {

	public WriteController() {
		System.out.println("wc객체 생성");
	}

	@Autowired
	@Qualifier("data")
	Data data;

	@RequestMapping("/write.do")
	public String write() {

		return "write";
	}

	@RequestMapping("/writeC.do")
	public String writeC(HttpServletRequest request) {
		String btitle = request.getParameter("title");
		String bcontent = request.getParameter("content");
		int bid = data.getList().get(data.getList().size() - 1).getBid() + 1;

		data.putItem(new VO(bid, btitle, bcontent));

		return "redirect:/list.do";
	}
}
