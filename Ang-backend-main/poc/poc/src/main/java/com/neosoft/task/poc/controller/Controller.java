package com.neosoft.task.poc.controller;

import java.util.List;

//import com.neosoft.task.poc.model.HelpRequest;
import com.neosoft.task.poc.model.QSUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.task.poc.model.Experience;
import com.neosoft.task.poc.service.ServiceImpl;


@RestController
public class Controller {

	@Autowired
	ServiceImpl Categoryservice;

  @GetMapping("/welcome")
  public String welcome(){
    return "welcome to user helping application";
  }
  @PostMapping("/login")
  private ResponseEntity<?> loginUser(@RequestBody QSUser userData){
    QSUser user=Categoryservice.getUser(userData.getUserName());
    if (user.getPassword().equals(userData.getPassword())){
      return new ResponseEntity<QSUser>(user, HttpStatus.OK);
    }
    return new ResponseEntity<>("bad Request", HttpStatus.INTERNAL_SERVER_ERROR);
  }



/*
	@PostMapping("/add")
	public ResponseEntity<?> addCategory(@RequestBody Experience Category) {

		if (Category == null) {
			return new ResponseEntity<>("invalid Category type", HttpStatus.OK);
		}  else {
			Categoryservice.saveCategory(Category);
			return new ResponseEntity<>("added succesfully", HttpStatus.CREATED);
		}
	}


	@GetMapping("/getall")
	public List<Experience> getall() {

		return Categoryservice.getAll();

	}

	@GetMapping("/getbyId/{Id}")
	public Experience getById(@PathVariable ("Id") int id) {

		return Categoryservice.getbyId(id);

	}

	@GetMapping("/getbyExp/{exp}")
	public List<Experience> getByExperience(@PathVariable ("exp") String exp) {

		return Categoryservice.getByExperience(exp);

	}



	@DeleteMapping("/delete/{Id}")
	public String DeleteCategory(@PathVariable ("Id") int id) {

		 Categoryservice.deleteById(id);
		 return "deleted sucessfully";

	}

	@PostMapping("/update/{Id}")
	public ResponseEntity<?> updateUser(@PathVariable("Id") int id, @RequestBody Experience category) {

		if (category == null) {
			return new ResponseEntity<>("invalid user type", HttpStatus.OK);
		}
		category.setExperienceid(id);
		Categoryservice.saveCategory(category);
		return new ResponseEntity<>(category, HttpStatus.CREATED);

	}
*/

//  @PostMapping("/help-request")
//  public ResponseEntity<String> submitHelpRequest(@RequestBody HelpRequest helpRequest) {
//    // Handle the help request, including sending location data to admin
//    // You can process help requests here
//    System.out.println("Help request received: " + helpRequest);
//    return ResponseEntity.ok("Help request submitted successfully!");
//  }
}
