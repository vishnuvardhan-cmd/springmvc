package com.spring.mvc.servlet;
import org.springframework.sterotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AddController {
	@RequestMapping("/add")
	public void add()
	{
		System.out.println("hello daridhram");
	}

}
