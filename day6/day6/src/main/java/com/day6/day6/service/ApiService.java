package com.day6.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.day6.entity.ApiEntity;
import com.day6.day6.repository.ApiRepository;



@Service
public class ApiService {
	@Autowired
	private ApiRepository apirepository;
	public Page<ApiEntity> getBabyByField(String field,int pageNo,int pageSize){
		Sort sort=Sort.by(field);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		return apirepository.findAll(pageable);
	}
	public ApiEntity getBaby(int babyid) {
		Optional<ApiEntity> optional=apirepository.findById(babyid);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	public int addBaby(ApiEntity f){
		ApiEntity save=apirepository.save(f);
		return save.getBabyid();
		}
	
	public List<ApiEntity> getAllBaby(){
		return apirepository.findAll();
	}
	
	public void updateBaby(ApiEntity f) {
		apirepository.save(f);
		
	}

}
