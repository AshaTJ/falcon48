package com.fis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.model.FundRequest;

@Repository
public interface FundRequestDao extends JpaRepository<FundRequest, Long>{

}
