package day7.day7.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import day7.day7.Entity.Car;
import day7.day7.Service.ApiService;
@RestController
public class ApiController {
	@Autowired
	private ApiService apiService;
	
	@PostMapping(path="/post")
	public ResponseEntity<Integer> addCar(@RequestBody Car f) {
		int id = apiService.addCar(f);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}
	
	
	@GetMapping(path="/get/{id}")
	public ResponseEntity<List<Car>> getAllCar(){
		List<Car> car = apiService.getAllCar();
		return ResponseEntity.status(HttpStatus.OK).body(car);
	}
	
	
	@PutMapping(path="/put")
	public ResponseEntity<String> updateCar(@RequestBody Car f) {
		apiService.updateCar(f);
		return ResponseEntity.ok("Updated");
	}
	@GetMapping("/getCarUsingJPQL")
	public List<Car> getAllCarUsingJPQL(){
		return apiService.getAllCarUsingJPQL();
	}
    @PutMapping("update/{newtype}/{old}")
    public String updateinfo(@PathVariable String newtype,@PathVariable int old) {
    	apiService.upadteinfo(newtype , old);
    	return "updated";
    }
	
	

}
