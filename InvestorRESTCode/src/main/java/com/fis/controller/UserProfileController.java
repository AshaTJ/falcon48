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

import com.fis.model.UserProfile;
import com.fis.repository.UserProfileDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @CrossOrigin
// @Controller
public class UserProfileController {
  @Autowired private UserProfileDao userProfileRespository;

  // @PostMapping("/employees/create")
  @CrossOrigin(origins = "http://localhost:4000")
  @RequestMapping(method = RequestMethod.POST, value = "userprofile/create")
  public UserProfile createUserProfile(@RequestBody UserProfile userProfile) {

    return userProfileRespository.save(userProfile);
  }

  @PutMapping("/userprofile/{id}")
  public ResponseEntity<UserProfile> updateUserProfile(
      @PathVariable(value = "id") long customerId, @Valid @RequestBody UserProfile profileDetails)
      throws ResourceNotFoundException {

    UserProfile userProfile =
        userProfileRespository
            .findById(customerId)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "Profile not found for this id :: " + customerId));
    userProfile.setTaxId(profileDetails.getTaxId());
    userProfile.setOrganization(profileDetails.isOrganization());
    userProfile.setName(profileDetails.getName());
    userProfile.setFirmType(profileDetails.getFirmType());
    userProfile.setEmailId(profileDetails.getEmailId());
    userProfile.setInBusinessSince(profileDetails.getInBusinessSince());
    userProfile.setRegistrationNo(profileDetails.getRegistrationNo());
    userProfile.setAddress1(profileDetails.getAddress1());
    userProfile.setAddress2(profileDetails.getAddress2());
    userProfile.setAddress3(profileDetails.getAddress3());
    userProfile.setCity(profileDetails.getCity());
    userProfile.setState(profileDetails.getState());
    userProfile.setZipcode(profileDetails.getZipcode());
    userProfile.setCountry(profileDetails.getCountry());
    userProfile.setContactPerson(profileDetails.getContactPerson());
    userProfile.setContactNumber(profileDetails.getContactNumber());
    final UserProfile updateUserProfile = userProfileRespository.save(userProfile);
    return ResponseEntity.ok(updateUserProfile);
  }

  @DeleteMapping("/userprofile/{id}")
  public Map<String, Boolean> deleteUserProfile(@PathVariable(value = "id") Long customerId)
      throws ResourceNotFoundException {

    UserProfile customer =
        userProfileRespository
            .findById(customerId)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException("Profile not found for this id : " + customerId));
    userProfileRespository.delete(customer);

    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }

  @GetMapping("/userprofile")

  // @RequestMapping(method = RequestMethod.GET, value="employees")
  public List<UserProfile> getAllUserProfile() {

    return userProfileRespository.findAll();
  }

  @GetMapping("/userprofile/{id}")
  public ResponseEntity<UserProfile> getUserProfileById(
      Model model, @PathVariable(value = "id") Long customerId) throws ResourceNotFoundException {

    UserProfile customer =
        userProfileRespository
            .findById(customerId)
            .orElseThrow(
                () -> new ResourceNotFoundException("No Profile found for this id: " + customerId));

    return ResponseEntity.ok(customer);
  }
}
