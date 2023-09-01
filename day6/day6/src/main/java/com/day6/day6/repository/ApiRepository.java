package com.day6.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.day6.entity.ApiEntity;

public interface ApiRepository extends JpaRepository<ApiEntity,Integer> {

}
