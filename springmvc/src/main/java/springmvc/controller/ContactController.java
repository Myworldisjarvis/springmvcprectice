package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
//	**************This is a old Tarika using servlet and annotations ( but ham ise bhi use kar sakate hai )***************
//	@RequestMapping(path="/processform" , method = RequestMethod.POST)
//	public String hendelForm(HttpServletRequest request) {
//		
//		String email = request.getParameter("email");
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		
//		
//		System.out.println(email+" "+name +" "+ password);
//		return "contact";
//	}
	
	
	
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String hendelForm(
			@RequestParam("email") String uEmail,
			@RequestParam("name") String uName,
			@RequestParam("password") String uPassword , Model model)  {

		System.out.println(uEmail +" "+ uName +" "+ uPassword);
		model.addAttribute("email" , uEmail);
		model.addAttribute("name" , uName);
		model.addAttribute("password" , uPassword);
		return "success";
	}
	
}
