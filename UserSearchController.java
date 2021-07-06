package com.neosoft.lara.restcontroler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.User;
import com.neosoft.lara.entity.UserRegistration;

@RestController
public class UserSearchController {

	@RequestMapping("/search")
	public String Test() {
		return "Welcome Neosoft Technology Employee search Pune"; 
	}

	//@RequestMapping(method = RequestMethod.GET, value="/user/alluser")

	//@RequestMapping("/search/user/{username}/{usersurname}/{userpincode}")
	@GetMapping("/search/user/{username}/{usersurname}/{userpincode}")
	@ResponseBody 
	public List<User> getAllsearchUser(@PathVariable("username") String firstName,
			@PathVariable("usersurname") String surname,@PathVariable("userpincode") int pincode){
		System.out.println("searching....");
		return UserRegistration.getInstance().searchUser(firstName, surname, pincode);//getStudentRecords(); 
	}



}
