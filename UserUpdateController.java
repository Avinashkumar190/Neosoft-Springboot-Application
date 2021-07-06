package com.neosoft.lara.restcontroler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.UserRegistration;

@RestController
public class UserUpdateController {

	//@RequestMapping(method = RequestMethod.PUT, value="/update/user")
	//@RequestMapping("/update/user")
	@PutMapping("/update/user")
	@ResponseBody
	public String updateUserRecord(@RequestBody User stdn) {
		System.out.println("In updateStudentRecord");   
		return UserRegistration.getInstance().upDateStudent(stdn);
	}

}
