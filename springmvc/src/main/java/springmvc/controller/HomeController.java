 package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// step 4 Controller  making
@Controller 
public class HomeController {

	@RequestMapping("/home")
	  public String home(Model modal) {
		
		//sending data from controller to view using model
		modal.addAttribute("name", " Sadaf Hussain Is Fullstack Devloper");
		  System.out.println("this is home url");
		  return "index";
	  }
	@RequestMapping("/about")
	  public String about() {
		  System.out.println("this is about url");
		  return "about";
	  }
	
	@RequestMapping("/help")
	public ModelAndView help() {
	 //creating modelAndView object 
		ModelAndView modelAndView = new ModelAndView();
		// setting data 
		modelAndView.addObject("srollnum",  1234);
		modelAndView.addObject("sname",  "sadaf");
		LocalDateTime date = LocalDateTime.now();
		modelAndView.addObject("date", date);
		// setting the view name jo name set karenge us page ko /help se dikhayegi and deta bhi usme get kar sakte hai 
		modelAndView.setViewName("help");
		
		System.out.println("this is help url");
		return modelAndView ;
		
	}
}