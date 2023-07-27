package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.model;
import com.example.demo.Service.services;

@CrossOrigin
@RestController
@RequestMapping("api/v1/user")
public class Controller {
	
		@Autowired
		services s;

		@GetMapping("/get")
		public List<model> showDetails() {
			return s.getDetails();
		}

		@PostMapping("/post")
		public String addDetails(@RequestBody model m) {
			s.add(m);
			return "Added product " + m.getUserid();
		}
		@PutMapping("/update")
		public model updateInfo(@RequestBody model st1) {
			return s.updateDetails(st1);
		}
		
		@DeleteMapping("/delete/{userid}")
		public String deleteInfo(@PathVariable("userid") int userid) {
			s.deleteDetails(userid);
			return "Deleted Details";
		}

		//sorting
		@GetMapping("/product/{field}")
		public List<model> getWithSort(@PathVariable String field) {
			return s.getSorted(field);
		}

		// pagination
		@GetMapping("/product/{offset}/{pageSize}")
		public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return s.getWithPagination(offset, pageSize);
		}
}
