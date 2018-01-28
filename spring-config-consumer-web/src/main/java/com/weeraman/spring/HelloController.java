package com.weeraman.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class HelloController {
	
	@Value("${greeting}")
	String greeting;
	
	@RequestMapping("/hello")
	public String getGreeting(Model m) {
		m.addAttribute("greeting", greeting);
		return "greeting";
	}

}
