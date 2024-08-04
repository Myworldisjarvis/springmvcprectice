package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	this is first way to redirect using prifix - fire one url open  url  two
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is [one]");
		return "redirect:/two";
	}
//	this is Second way to redirect using RedirectView class ob - fire redirectclass url open  url  two
	@RequestMapping("/redirectclass")
	public RedirectView three() {
		System.out.println("this is [redirect to ]");
		RedirectView rv = new RedirectView();
		rv.setUrl("two");
		return rv;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is this is one to two");
		return "contact";
	}
	
}
