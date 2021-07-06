package com.neosoft.lara.restcontroler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.lara.entity.UserRegistration;

@RestController
public class UserDeleteController {

	//@RequestMapping(method = RequestMethod.DELETE, value="/delete/user/{regid}")

	//@RequestMapping("/delete/user/{userid}")
	@DeleteMapping("/delete/user/{userid}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("userid") int regdNum) {
		System.out.println("In deleteStudentRecord");   
		return UserRegistration.getInstance().deleteStudent(regdNum);
	}

}
