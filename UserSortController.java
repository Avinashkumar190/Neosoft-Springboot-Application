package com.neosoft.lara.restcontroler;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.UserRegistration;

@RestController
public class UserSortController {
	@RequestMapping("/sort")
	public String Test() {
		return "Welcome Neosoft Technology Employee sort Pune"; 
	}

	//@RequestMapping("/sort/user/{userdob}/{userjoiningdate}")
	@GetMapping("/sort/user/{userdob}/{userjoiningdate}")
	@ResponseBody 
	public List<User> getAllsortUser(@PathVariable("userdob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String dob,
			@PathVariable("userjoiningdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String joiningdate){
		System.out.println("sorting....");
		return UserRegistration.getInstance().sortUser(dob, joiningdate); 
	}

}
