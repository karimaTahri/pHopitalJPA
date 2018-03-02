package pHopitalJPA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pHopitalJPA.model.Patient;
import pHopitalJPA.repository.PatientRepository;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientRepository patientRepository;

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", patientRepository.findAll());
		return "patient/list";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		return edit(new Patient(), model);
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute("patient") @Valid Patient patient, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute("patient", patient);
			return "patient/edit";
		}
		patientRepository.save(patient);
		// model.addAttribute("list", patientRepository.findAll());
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam(name = "id", required = true) Integer id, Model model) {
		patientRepository.delete(id);
		// model.addAttribute("list", patientRepository.findAll());
		return "redirect:list";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam(name = "id", required = true) Integer id, Model model) {
		return edit(patientRepository.findOne(id), model);
	}

	private String edit(Patient patient, Model model) {
		model.addAttribute("patient", patient);
			return "patient/edit";
	}

}
