package edu.miu.cs.cs425.semowebapps.eRegistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EregistrarController {

	
	@GetMapping({"/","/home/eregister"})
	public String displayHomePage() {
		
		return "/home/index";
	}

}
