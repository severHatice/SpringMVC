package com.sever.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sonuc_controller {//beyin sinifi

	@RequestMapping("submit")
	public String islemYap(@RequestParam ("sayi1") int s1,@RequestParam("sayi2")int s2,Model m) {
		
		m.addAttribute("numberssum",s1+s2);
		m.addAttribute("numbersmultiply",s1*s2);
		return "sonuc";
	}
}
