package pHopitalJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pHopitalJPA.repository.VisiteRepository;

@Controller
@RequestMapping("/visite")
public class VisiteController {
	
	@Autowired
	VisiteRepository visiteRepository;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView("visite/list");
		modelAndView.addObject("list", visiteRepository.findAll());
		return modelAndView;
	}
	

}
