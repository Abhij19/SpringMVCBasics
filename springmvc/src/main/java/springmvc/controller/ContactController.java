package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataforModel(Model m)
	{
		m.addAttribute("Header","This header is common data");
	}
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		if(user.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","User created with id" + createdUser);
		return "success";
	}
}
