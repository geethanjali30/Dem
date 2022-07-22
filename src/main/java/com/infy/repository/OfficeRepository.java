package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.Office;

@Repository
public interface OfficeRepository extends CrudRepository<Office, Integer> {

}
