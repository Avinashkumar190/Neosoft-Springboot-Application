package com.neosoft.lara.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.Random.lara.RandomUtil;

public class UserRegistration {
	private List<User> studentRecords;

	private static UserRegistration stdregd = null;

	private UserRegistration(){
		studentRecords = new ArrayList<User>();
	}

	public static UserRegistration getInstance() {

		if(stdregd == null) {
			stdregd = new UserRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

	public void add(User std) {
		Random ran = new Random();
		int nxt = ran.nextInt(10);
		std.setId(nxt);
		studentRecords.add(std);
	}

	public String upDateStudent(User std) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			User stdn = studentRecords.get(i);
			if(Integer.toString(stdn.getId()).equals(Integer.toString(std.getId()))) {
				studentRecords.set(i, std);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteStudent(int idnumber) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			User stdn = studentRecords.get(i);
			if(Integer.toString(stdn.getId()).equals(Integer.toString(idnumber))){
				studentRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}
	//search user concept
	public List<User> searchUser(String firstName,String surname, int pincode) {

		List<User> listuser;
		Iterator<User> iterator = studentRecords.iterator(); 
		listuser = new ArrayList<User>();
		while(iterator.hasNext()) {
			User user = (User) iterator.next();
			if (user.getFirstName().equals(firstName)
					&& user.getSurName().equals(surname) &&
					Integer.toString(user.getPincode()).equals(Integer.toString(pincode))) {
				listuser.add(user);
			}
		}
		return listuser;
	}

	//sorting user concept Sorting on multiple fields; Group by.
	public List<User> sortUser(String dob,String joiningdate ){

		Comparator<User> groupByComparator = Comparator.comparing(User::getDob).thenComparing(User::getJoiningDate);
		studentRecords.sort(groupByComparator);
		return studentRecords;

	}

	public List<User> getStudentRecords() {
		return studentRecords;
	}


}
