package pHopitalJPA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pHopitalJPA.model.Visite;
import pHopitalJPA.repository.PatientRepository;
import pHopitalJPA.repository.VisiteRepository;

@Controller
@RequestMapping("/visite")
public class VisiteController {
	
	@Autowired
	VisiteRepository visiteRepository;
	

	
	@Autowired
	PatientRepository patientRepository;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView("visite/list");
		modelAndView.addObject("list", visiteRepository.findAll());
		return modelAndView;
	}
	
	
	@RequestMapping("/add")
	public ModelAndView addBleuRay() {
		return edit(new Visite());
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(name="id", required= true) Integer id) {
		return edit(visiteRepository.findOne(id));
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("visite") @Valid Visite visite, BindingResult br, Model monModel) {
		if (br.hasErrors()) {
			monModel.addAttribute("visite", visite);
			return "visite/edit";
		}
		visiteRepository.save(visite);
		return "redirect:list";
	}
	
	
	private ModelAndView edit(Visite visite){
		ModelAndView modelAndView = new ModelAndView("visite/edit");
		modelAndView.addObject("visite", visite);
		modelAndView.addObject("patients",patientRepository.findAll());
		return modelAndView;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(name="id", required= true) Integer id, Model monModel) {
		visiteRepository.delete(id);
		return "redirect:list";
	}
	

}
