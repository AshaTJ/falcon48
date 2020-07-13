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

import com.fis.model.Verification;
import com.fis.repository.VerificationDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @CrossOrigin
// @Controller
public class VerificationController {
  @Autowired private VerificationDao verificationRespository;

  // @PostMapping("/employees/create")
  @CrossOrigin(origins = "http://localhost:4000")
  @RequestMapping(method = RequestMethod.POST, value = "verification/create")
  public Verification createFundRequest(@RequestBody Verification verification) {

    return verificationRespository.save(verification);
  }

  @PutMapping("/verification/{id}")
  public ResponseEntity<Verification> updateFundRequest(
      @PathVariable(value = "id") Long id, @Valid @RequestBody Verification verificationDetails)
      throws ResourceNotFoundException {

    Verification verification =
        verificationRespository
            .findById(id)
            .orElseThrow(
                () -> new ResourceNotFoundException("Fund Request not found for this id :: " + id));
    verification.setFirstName(verificationDetails.getFirstName());
    verification.setEmailId(verificationDetails.getEmailId());
  

    final Verification updateFundRequest = verificationRespository.save(verification);
    return ResponseEntity.ok(updateFundRequest);
  }

  @DeleteMapping("/verification/{id}")
  public Map<String, Boolean> deleteFundRequest(@PathVariable(value = "id") Long id)
      throws ResourceNotFoundException {

    Verification verification =
        verificationRespository
            .findById(id)
            .orElseThrow(
                () -> new ResourceNotFoundException("FundRequest not found for this id : " + id));
    verificationRespository.delete(verification);

    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }

  @GetMapping("/verifications")

  // @RequestMapping(method = RequestMethod.GET, value="employees")
  public List<Verification> getAllFundRequests() {

    return verificationRespository.findAll();
  }

  @GetMapping("/verifications/{id}")
  public ResponseEntity<Verification> getFundRequestById(
      Model model, @PathVariable(value = "id") Long id) throws ResourceNotFoundException {

    Verification verification =
        verificationRespository
            .findById(id)
            .orElseThrow(
                () -> new ResourceNotFoundException("No FundRequest found for this id: " + id));
    return ResponseEntity.ok(verification);
  }
}
