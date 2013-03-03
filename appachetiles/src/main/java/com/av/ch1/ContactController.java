package com.av.ch1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.tiles.preparer.ViewPreparerSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContactController extends ViewPreparerSupport {
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact(Model model) {
		logger.info("Welcome home! The client locale is {}.");
		model.addAttribute("headerMessage", "qqqqqqq");
	
		return "contact";
	}
}
