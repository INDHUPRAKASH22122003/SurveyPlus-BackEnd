package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.model;
import com.example.demo.Repository.Repository;

@Service
public class services {

		@Autowired
		Repository r;
		
		public String add(model m) {
			r.save(m);
			return "Added";
		}
		
		public List<model> getDetails() {
			return r.findAll();
		}
		
		public model updateDetails(model e1) {
			return r.saveAndFlush(e1);
		}
		
		public void deleteDetails(int userid) {
			r.deleteById(userid);
		}
		
		public List<model> getSorted(String field) {
			return r.findAll(Sort.by(Sort.Direction.ASC,field));
		}
		
		public List<model> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			Page<model> page =r.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}


}