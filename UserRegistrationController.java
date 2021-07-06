package com.neosoft.lara.restcontroler;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Random.lara.RandomUtil;
import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.UserRegistration;
import com.neosoft.lara.entity.UserRegistrationReply;

@RestController
//@RequestMapping("/api")
public class UserRegistrationController {

	//@RequestMapping(method = RequestMethod.POST, value="/register/user")
	//@RequestMapping("/register/user")
	@PostMapping("/register/user")
	@ResponseBody
	public UserRegistrationReply registerStudent(@Valid @RequestBody User student) {
		System.out.println("In registerUser");
		UserRegistrationReply stdregreply = new UserRegistrationReply();
		UserRegistration.getInstance().add(student);
		//We are setting the below value just to reply a message back to the caller
		stdregreply.setId(student.getId());
		stdregreply.setFirstName(student.getFirstName());
		stdregreply.setSurName(student.getSurName());
		stdregreply.setPincode(student.getPincode());
		stdregreply.setDob(student.getDob());
		stdregreply.setJoiningDate(student.getJoiningDate());
		stdregreply.setRegistrationStatus("Successful");

		return stdregreply;
	}

}
