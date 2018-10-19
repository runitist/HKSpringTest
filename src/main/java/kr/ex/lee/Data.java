package kr.ex.lee;

import java.util.ArrayList;
import java.util.List;

public class Data {

	List<VO> lv = new ArrayList<VO>();

	Data() {
		lv.add(new VO(0, "0번", "0번 내용"));
		System.out.println("Data 객체 생성");
	}

	public List<VO> getList() {
		return lv;
	}

	public VO getItem(int index) {
		return lv.get(index);
	}

	public void putItem(VO vo) {
		lv.add(vo);
	}

}
