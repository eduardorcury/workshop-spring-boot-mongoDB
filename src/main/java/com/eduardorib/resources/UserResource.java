package com.eduardorib.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardorib.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		User eduardo = new User("1", "Eduardo", "eduardo@gmail.com");
		User eliz = new User("1", "Eliz", "elizabeth@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(eduardo, eliz));
		
		return ResponseEntity.ok().body(list);
		
				
	}

}
