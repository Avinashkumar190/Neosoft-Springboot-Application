package com.neosoft.lara.restcontroler;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.lara.entity.User;

@RestController
public class UserValidationController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(false);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/validation")
	public String showForm(Model themodel) {
		themodel.addAttribute("user", new User());
		return "user-Success";
		//return processForm( @RequestBody User stude);
	}

	@RequestMapping("/validationForm")
	public String processForm(@Valid @ModelAttribute("user") User theuser, 
			BindingResult theBindingResult) {
		//System.out.println("First name:|" + theuser.getFirstName() + "|");
		if(theBindingResult.hasErrors()) {
			return "user-Success";
		}else {
			return "user-Conformation";
		}
	}

}
