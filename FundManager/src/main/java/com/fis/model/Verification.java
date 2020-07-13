package com.fis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq", initialValue=100, allocationSize=1000)
public class Verification {
	
	 @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	 private long id;
	  private String firstName;
	  private String lastName;
	  private String emailId;
	  private String dateOfBirth;
	  private String address;
	  private String registrationNo;
	  private String address1;
	  private String address2;
	  private String address3;
	  private String state;
	  private String zipcode;
	  private String country;
	  private String contactPerson;
	  private String contactNumber;
	  private String status;
	  
	  private String hashedFirstName;
	  private String hashedLastName;
	  private String hashedEmailId;
	  private String hashedDateOfBirth;
	  private String hashedAddress;
	  private String hashedRegistrationNo;
	  private String hashedAddress1;
	  private String hashedAddress2;
	  private String hashedAddress3;
	  private String hashedState;
	  private String hashedZipcode;
	  private String hashedCountry;
	  private String hashedContactPerson;
	  private String hashedContactNumber;
	  
	  
	  
	  public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public long getId() {
		return id;
	}



	public Verification() {
		  
	  }

	  
	  
	public String getHashedFirstName() {
		return hashedFirstName;
	}



	public void setHashedFirstName(String hashedFirstName) {
		this.hashedFirstName = hashedFirstName;
	}



	public String getHashedLastName() {
		return hashedLastName;
	}



	public void setHashedLastName(String hashedLastName) {
		this.hashedLastName = hashedLastName;
	}



	public String getHashedEmailId() {
		return hashedEmailId;
	}



	public void setHashedEmailId(String hashedEmailId) {
		this.hashedEmailId = hashedEmailId;
	}



	public String getHashedDateOfBirth() {
		return hashedDateOfBirth;
	}



	public void setHashedDateOfBirth(String hashedDateOfBirth) {
		this.hashedDateOfBirth = hashedDateOfBirth;
	}



	public String getHashedAddress() {
		return hashedAddress;
	}



	public void setHashedAddress(String hashedAddress) {
		this.hashedAddress = hashedAddress;
	}



	public String getHashedRegistrationNo() {
		return hashedRegistrationNo;
	}



	public void setHashedRegistrationNo(String hashedRegistrationNo) {
		this.hashedRegistrationNo = hashedRegistrationNo;
	}



	public String getHashedAddress1() {
		return hashedAddress1;
	}



	public void setHashedAddress1(String hashedAddress1) {
		this.hashedAddress1 = hashedAddress1;
	}



	public String getHashedAddress2() {
		return hashedAddress2;
	}



	public void setHashedAddress2(String hashedAddress2) {
		this.hashedAddress2 = hashedAddress2;
	}



	public String getHashedAddress3() {
		return hashedAddress3;
	}



	public void setHashedAddress3(String hashedAddress3) {
		this.hashedAddress3 = hashedAddress3;
	}



	public String getHashedState() {
		return hashedState;
	}



	public void setHashedState(String hashedState) {
		this.hashedState = hashedState;
	}



	public String getHashedZipcode() {
		return hashedZipcode;
	}



	public void setHashedZipcode(String hashedZipcode) {
		this.hashedZipcode = hashedZipcode;
	}



	public String getHashedCountry() {
		return hashedCountry;
	}



	public void setHashedCountry(String hashedCountry) {
		this.hashedCountry = hashedCountry;
	}



	public String getHashedContactPerson() {
		return hashedContactPerson;
	}



	public void setHashedContactPerson(String hashedContactPerson) {
		this.hashedContactPerson = hashedContactPerson;
	}



	public String getHashedContactNumber() {
		return hashedContactNumber;
	}



	public void setHashedContactNumber(String hashedContactNumber) {
		this.hashedContactNumber = hashedContactNumber;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Verification(long id, String firstName, String lastName, String emailId, String dateOfBirth, String address,
			String registrationNo, String address1, String address2, String address3, String state, String zipcode,
			String country, String contactPerson, String contactNumber, String hashedFirstName, String hashedLastName,
			String hashedEmailId, String hashedDateOfBirth, String hashedAddress, String hashedRegistrationNo,
			String hashedAddress1, String hashedAddress2, String hashedAddress3, String hashedState,
			String hashedZipcode, String hashedCountry, String hashedContactPerson, String hashedContactNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.registrationNo = registrationNo;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.hashedFirstName = hashedFirstName;
		this.hashedLastName = hashedLastName;
		this.hashedEmailId = hashedEmailId;
		this.hashedDateOfBirth = hashedDateOfBirth;
		this.hashedAddress = hashedAddress;
		this.hashedRegistrationNo = hashedRegistrationNo;
		this.hashedAddress1 = hashedAddress1;
		this.hashedAddress2 = hashedAddress2;
		this.hashedAddress3 = hashedAddress3;
		this.hashedState = hashedState;
		this.hashedZipcode = hashedZipcode;
		this.hashedCountry = hashedCountry;
		this.hashedContactPerson = hashedContactPerson;
		this.hashedContactNumber = hashedContactNumber;
	}

	
	  

}
