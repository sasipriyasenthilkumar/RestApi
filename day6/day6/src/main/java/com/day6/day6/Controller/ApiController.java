package com.day6.day6.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.day6.entity.ApiEntity;
import com.day6.day6.service.ApiService;



@RestController
public class ApiController {
	@Autowired
	private ApiService apiService;
	@PostMapping(path="/post")
	public ResponseEntity<Integer> addbaby(@RequestBody ApiEntity f) {
		int id = apiService.addBaby(f);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}
	
	
	@GetMapping(path="/get/{babyid}")
	public ResponseEntity<List<ApiEntity>> getAllBaby(){
		List<ApiEntity> baby = apiService.getAllBaby();
		return ResponseEntity.status(HttpStatus.OK).body(baby);
	}
	
	
	@PutMapping(path="/put")
	public ResponseEntity<String> updatebaby(@RequestBody ApiEntity f) {
		apiService.updateBaby(f);
		return ResponseEntity.ok("Updated");
	}
	@GetMapping(path="/getpage")
	public ResponseEntity<Page<ApiEntity>> getBabyByField(@RequestParam String field,@RequestParam int pageNo,@RequestParam int pageSize){
		Page<ApiEntity> baby=apiService.getBabyByField(field, pageNo, pageSize);
		return ResponseEntity.ok(baby);
	}
	

}
