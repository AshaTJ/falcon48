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
import com.fis.repository.FundRequestDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @CrossOrigin
// @Controller
public class FundRequestController {
  @Autowired private FundRequestDao fundRequestRespository;

  // @PostMapping("/employees/create")
  @CrossOrigin(origins = "http://localhost:4000")
  @RequestMapping(method = RequestMethod.POST, value = "fundrequests/create")
  public FundRequest createFundRequest(@RequestBody FundRequest fundRequest) {

    return fundRequestRespository.save(fundRequest);
  }

  @PutMapping("/fundrequests/{id}")
  public ResponseEntity<FundRequest> updateFundRequest(
      @PathVariable(value = "id") Long fundRequestId,
      @Valid @RequestBody FundRequest fundRequestDetails)
      throws ResourceNotFoundException {

    FundRequest fundRequest =
        fundRequestRespository
            .findById(fundRequestId)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "Fund Request not found for this id :: " + fundRequestId));
    fundRequest.setDescription(fundRequestDetails.getDescription());
    fundRequest.setCompanyName(fundRequestDetails.getCompanyName());
    fundRequest.setPublicEntity(fundRequestDetails.getPublicEntity());
   fundRequest.setFundReference(fundRequestDetails.getFundReference());

    final FundRequest updateFundRequest = fundRequestRespository.save(fundRequest);
    return ResponseEntity.ok(updateFundRequest);
  }

  @DeleteMapping("/fundrequests/{id}")
  public Map<String, Boolean> deleteFundRequest(@PathVariable(value = "id") Long fundRequestId)
      throws ResourceNotFoundException {

    FundRequest fundRequest =
        fundRequestRespository
            .findById(fundRequestId)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "FundRequest not found for this id : " + fundRequestId));
    fundRequestRespository.delete(fundRequest);

    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }

  @GetMapping("/fundrequests")

  // @RequestMapping(method = RequestMethod.GET, value="employees")
  public List<FundRequest> getAllFundRequests() {

    return fundRequestRespository.findAll();
  }

  @GetMapping("/fundrequests/{id}")
  public ResponseEntity<FundRequest> getFundRequestById(
      Model model, @PathVariable(value = "id") Long fundRequestId)
      throws ResourceNotFoundException {

    FundRequest fundRequest =
        fundRequestRespository
            .findById(fundRequestId)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "No FundRequest found for this id: " + fundRequestId));
    return ResponseEntity.ok(fundRequest);
  }
}
