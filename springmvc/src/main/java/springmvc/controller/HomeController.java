package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("Home page");
		model.addAttribute("name","Abhijeet Jha");
		model.addAttribute("id",142);
		List<String> names=new ArrayList<String>();
		names.add("Rahul");
		names.add("Ravi");
		model.addAttribute("list",names);
		return "hello";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Dev");
		List<String> places=new ArrayList<String>();
		places.add("Delhi");
		places.add("Noida");
		modelAndView.addObject("place",places);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
