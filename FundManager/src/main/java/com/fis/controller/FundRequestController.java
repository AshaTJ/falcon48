package com.fis.controller;

import java.util.HashMap;



import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.model.FundRequest;
import com.fis.repository.FundRequestDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

//@Controller
public class FundRequestController {
	@Autowired
	private FundRequestDao fundRequestRespository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, value="/fundrequest/create")	
	public FundRequest createFundRequest( @RequestBody FundRequest FundRequest) {
			
		return fundRequestRespository.save(FundRequest);

	}

	@PutMapping("/fundrequest/{id}")
	public ResponseEntity<FundRequest> updateFundRequest(@PathVariable(value = "id") Long fundRequestId,
			@Valid @RequestBody FundRequest fundRequestDetails) throws ResourceNotFoundException {

		FundRequest fundRequest = fundRequestRespository.findById(fundRequestId)
				.orElseThrow(() -> new ResourceNotFoundException("FundRequest not found for this id :: " + fundRequestId));
		fundRequest.setCompanyName(fundRequestDetails.getCompanyName());
		fundRequest.setDescription(fundRequestDetails.getDescription());
		fundRequest.setFundReference(fundRequestDetails.getFundReference());
		fundRequest.setPublicEntity(fundRequestDetails.getPublicEntity());
		fundRequest.setEmailId(fundRequestDetails.getEmailId());
		fundRequest.setAddress1(fundRequestDetails.getAddress1());
		fundRequest.setAddress2(fundRequestDetails.getAddress2());
		fundRequest.setAddress3(fundRequestDetails.getAddress3());
		fundRequest.setContactNumber(fundRequestDetails.getContactNumber());
		fundRequest.setContactPerson(fundRequestDetails.getContactPerson());
		fundRequest.setStatus(fundRequestDetails.getStatus());
		final FundRequest updateFundRequest = fundRequestRespository.save(fundRequest);
		return ResponseEntity.ok(updateFundRequest);
	}

	@DeleteMapping("/fundrequest/{id}")
	public Map<String, Boolean> deleteFundRequest(@PathVariable(value = "id") Long fundRequestId)
			throws ResourceNotFoundException {

		FundRequest FundRequest = fundRequestRespository.findById(fundRequestId)
				.orElseThrow(() -> new ResourceNotFoundException("FundRequest not found for this id : " + fundRequestId));
		fundRequestRespository.delete(FundRequest);

		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@GetMapping("/fundrequest")
	
	//@RequestMapping(method = RequestMethod.GET, value="fundRequests")
	public List<FundRequest> getAllfundRequests() {

		return fundRequestRespository.findAll();
	}

	@GetMapping("/fundrequest/{id}")
	
	public ResponseEntity<FundRequest> getFundRequestById(Model model, @PathVariable(value = "id") Long fundRequestId)
			throws ResourceNotFoundException {

		FundRequest FundRequest = fundRequestRespository.findById(fundRequestId)
				.orElseThrow(() -> new ResourceNotFoundException("No FundRequest found for this id: " + fundRequestId));
		/*model.addAttribute("FundRequest", FundRequest);
		return "FundRequestview";*/
		
		return ResponseEntity.ok(FundRequest);

	}

}
