package com.fis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fis.model.FundRequest;
import com.fis.model.Verification;
import com.fis.repository.VerificationDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VerificationController {
	@Autowired
	private VerificationDao verificationDao;

	@RequestMapping(method = RequestMethod.POST, value = "/verification/create")

	public Verification createFundRequest(@RequestBody Verification verification) {
		return verificationDao.save(verification);

	}

	@PutMapping("/verification/{id}")
	public ResponseEntity<Verification> updateFundRequest(@PathVariable(value = "id") Long verificationId,
			@Valid @RequestBody Verification verificationDetails) throws ResourceNotFoundException {

		Verification verification = verificationDao.findById(verificationId).orElseThrow(
				() -> new ResourceNotFoundException("FundRequest not found for this id :: " + verificationId));
	
		verification.setFirstName(verificationDetails.getFirstName());
		verification.setLastName(verificationDetails.getLastName());
		verification.setEmailId(verificationDetails.getEmailId());
		verification.setAddress(verificationDetails.getAddress());
		verification.setAddress1(verificationDetails.getAddress1());
		verification.setAddress2(verificationDetails.getAddress2());
		verification.setAddress3(verificationDetails.getAddress3());
		verification.setContactNumber(verificationDetails.getContactNumber());
		verification.setContactPerson(verificationDetails.getContactPerson());
		verification.setCountry(verificationDetails.getCountry());
		verification.setDateOfBirth(verificationDetails.getDateOfBirth());
		verification.setRegistrationNo(verificationDetails.getRegistrationNo());
		verification.setState(verificationDetails.getState());
		verification.setZipcode(verificationDetails.getZipcode());
		verification.setHashedFirstName(verificationDetails.getHashedFirstName());
		verification.setHashedLastName(verificationDetails.getHashedLastName());
		verification.setHashedEmailId(verificationDetails.getHashedEmailId());
		verification.setHashedAddress(verificationDetails.getHashedAddress());
		verification.setHashedAddress1(verificationDetails.getHashedAddress1());
		verification.setHashedAddress2(verificationDetails.getHashedAddress2());
		verification.setHashedAddress3(verificationDetails.getHashedAddress3());
		verification.setHashedContactNumber(verificationDetails.getHashedContactNumber());
		verification.setHashedContactPerson(verificationDetails.getHashedContactPerson());
		verification.setHashedCountry(verificationDetails.getHashedCountry());
		verification.setHashedDateOfBirth(verificationDetails.getHashedDateOfBirth());
		verification.setHashedRegistrationNo(verificationDetails.getHashedRegistrationNo());
		verification.setHashedState(verificationDetails.getHashedState());
		verification.setHashedZipcode(verificationDetails.getHashedZipcode());
		verification.setStatus(verificationDetails.getStatus());
		
		final Verification updateVerification = verificationDao.save(verification);
		return ResponseEntity.ok(updateVerification);
	}

	@DeleteMapping("/verification/{id}")
	public Map<String, Boolean> deleteVerification(@PathVariable(value = "id") Long verificationId)
			throws ResourceNotFoundException {

		Verification verification = verificationDao.findById(verificationId).orElseThrow(
				() -> new ResourceNotFoundException("Verification not found for this id : " + verificationId));
		verificationDao.delete(verification);

		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@GetMapping("/verification")

	// @RequestMapping(method = RequestMethod.GET, value="fundRequests")
	public List<Verification> getAllVerifications() {

		return verificationDao.findAll();
	}

	@GetMapping("/verification/{id}")

	public ResponseEntity<Verification> getVerificationById(Model model, @PathVariable(value = "id") Long verificationId)
			throws ResourceNotFoundException {

		Verification verification = verificationDao.findById(verificationId)
				.orElseThrow(() -> new ResourceNotFoundException("No verification found for this id: " + verificationId));
	
		return ResponseEntity.ok(verification);

	}

}
