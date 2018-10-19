package com.ex.lee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ex.lee.Data;
import kr.ex.lee.VO;

@Controller
public class ListController {

	public ListController() {
		System.out.println("lc객체 생성");
	}

	@Autowired
	@Qualifier("data")
	Data data;

	@RequestMapping("/list.do")
	public String list(Model model) {
		List<VO> lv = data.getList();
		model.addAttribute("lv", lv);

		return "list";
	}
}
