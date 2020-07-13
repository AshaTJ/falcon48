package com.fis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.model.Users;
import com.fis.model.Verification;


@Repository
public interface VerificationDao extends JpaRepository<Verification, Long>{
	
	
}
