package com.dxc.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showForm() {
		return "form1";
	}
	
	@RequestMapping(value = "showName" , method = RequestMethod.POST)
	public ModelAndView showName(@RequestParam("devname") String name, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name" , name);
		modelAndView.setViewName("dispName");
        return modelAndView ;
	}

}
