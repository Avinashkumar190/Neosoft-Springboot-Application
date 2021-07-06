package com.neosoft.lara.restcontroler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.UserRegistration;

@RestController
//@RequestMapping("/api")
public class UserRetrieveRestController {

	@RequestMapping("/api")
	public String Test() {
		return "Welcome Neosoft Technology Pune";
	}

	//@RequestMapping(method = RequestMethod.GET, value="/user/alluser")
	//@RequestMapping("/alluser")
	@GetMapping("/alluser")
	@ResponseBody
	public List<User> getAllStudents() {
		return UserRegistration.getInstance().getStudentRecords();
	}

} 
