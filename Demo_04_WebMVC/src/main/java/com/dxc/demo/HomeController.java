package com.dxc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.model.Student;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Student student) {
		//System.out.println("Inside of action method");
		return "studentForm";
	}

	@RequestMapping("dispstudent")
	public void main() {

	}
	
	@RequestMapping(value = "dispstudent" , method = RequestMethod.POST)
	public ModelAndView dispstudent(Student student) {
		ModelAndView modelAndView = new ModelAndView("dispstudent");
		modelAndView.addObject("stud", student);
		return modelAndView;
	}
}
