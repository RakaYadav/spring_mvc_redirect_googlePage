package spring_mvc_redirectPage_project_google.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/search")
	public String search() {
		return "gPage";
	}
	@RequestMapping("/gdataPage")
	public RedirectView gdataPage(@RequestParam("searchBox") String searchBox) {
		String url ="https://www.google.com/search?q="+searchBox;
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
		
	}

}
