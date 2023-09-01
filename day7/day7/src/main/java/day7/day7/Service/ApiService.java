package day7.day7.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import day7.day7.Entity.Car;
import day7.day7.Repository.CarRepo;

@Service
public class ApiService {
	@Autowired
	private CarRepo carrepo;
	public Car getCar(int id) {
		Optional<Car> optional=carrepo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	public int addCar(Car f){
		Car save=carrepo.save(f);
		return save.getId();
		}
	
	public List<Car> getAllCar(){
		return carrepo.findAll();
	}
	
	public void updateCar(Car f) {
		carrepo.save(f);
		
	}
	public List<Car> getAllCarUsingJPQL(){
		return carrepo.getAllCarUsingJPQL();
	}



	public String upadteinfo(String newtype, int old) {
		// TODO Auto-generated method stub
		carrepo.updateinfo(newtype,old);
     return "updated";
}
}
