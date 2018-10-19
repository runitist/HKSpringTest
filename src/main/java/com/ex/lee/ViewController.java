package com.ex.lee;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ex.lee.Data;

@Controller
public class ViewController {
	
	public ViewController() {
		System.out.println("vc 객체 생성");
	}
	
	@Autowired
	@Qualifier("data")
	Data data;
	
	@RequestMapping("/view.do")
	public String view(Model model, HttpServletRequest request) {
		int index = Integer.parseInt(request.getParameter("id"));
		model.addAttribute("vo", data.getItem(index));
		return "view";
	}
}
