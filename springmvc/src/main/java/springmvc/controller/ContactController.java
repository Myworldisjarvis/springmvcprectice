package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Wellcome To ShopStar");
		m.addAttribute("Desc", "This is a register form");
		
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	
//	(3) this is the more unique way using @ModelAttribute  (transfer daynamic data view to controller and controller to view)
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String hendelForm(@ModelAttribute User user , Model model) {	
		
		
//		if user name is blank then redirect to return contact form 
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);	
		return "success";
			}
	

		
	/*
	//	(2) This is a lengthy way to view to controller and controller to view
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String hendelForm(
			@RequestParam("email") String uEmail,
			@RequestParam("name") String uName,
			@RequestParam("password") String uPassword , Model model)  {

		User user =new User();
		user.setName(uName);
		user.setEmail(uEmail);
		user.setPassword(uPassword);
		
		System.out.println(user);
		model.addAttribute("user",user);
		
//		System.out.println(uEmail +" "+ uName +" "+ uPassword);
//		model.addAttribute("email" , uEmail);
//		model.addAttribute("name" , uName);
//		model.addAttribute("password" , uPassword);
		return "success";
	}
	*/
	
//	(1) **************This is a old Tarika using servlet and annotations ( but ham ise bhi use kar sakate hai )***************
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
		
	

	
}
