package kr.or.ddit.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.command.SearchCriteria;
import com.jsp.dto.NoticeVO;
import com.jsp.service.NoticeService;



@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/main")
	public void main() {}
	
	@RequestMapping("/list")
	public ModelAndView noticeList(ModelAndView mnv, HttpServletRequest request, SearchCriteria cri) throws SQLException {
		String url = "notice/list";
		
		Map<String, Object> dataMap = null;
		
		try {
			dataMap = noticeService.getNoticeList(cri);
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mnv.addObject("dataMap", dataMap);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String noticeDetail(int nno, Model model) throws Exception {
		String url = "notice/detail";
		
		NoticeVO notice = noticeService.getNotice(nno);
		
		model.addAttribute("notice", notice);
		
		return url;
	}
	
	@RequestMapping(value = "/registForm", method = RequestMethod.GET)
	public String registForm() throws Exception {
		String url = "notice/regist";
		return url;
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(NoticeVO notice) throws Exception {
		String url = "notice/regist_success";
		
		notice.setWriter("mimi");
		noticeService.regist(notice);
		
		return url;
	}
}
