package com.flores.HelloHuman.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	

	@RequestMapping("")
	private String index(@RequestParam(value="name",required = false) String namex, Model xp2)
	{
		if(namex==null)
		{
			xp2.addAttribute("displ","HELLO HUMAN!");
		}
		else
		{
			xp2.addAttribute("displ","HELLO "+namex);
		}
		return "index.jsp";
	}
	
	


}
