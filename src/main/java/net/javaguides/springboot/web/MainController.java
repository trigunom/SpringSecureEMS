package net.javaguides.springboot.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String home() {
		// Check if user is authenticated
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || authentication.getPrincipal().equals("anonymousUser")) {
			// User is not authenticated, redirect to login
			return "redirect:/login";
		}
		// User is authenticated, redirect to employees page
		return "redirect:/employees";
	}
}