package com.fis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq", initialValue=100, allocationSize=1000)
public class FundRequest {
  @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
  	private long id;
  	private String emailId;
  	private String address1;
  	private String address2;
  	private String address3;
  	private String contactPerson;
  	private String contactNumber;
	private String description;
	private String companyName;
	private String publicEntity;
	private String fundReference;
	private String status;
	
	public FundRequest(long id, String emailId, String address1, String address2, String address3, String contactPerson,
			String contactNumber, String description, String companyName, String publicEntity, String fundReference) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.description = description;
		this.companyName = companyName;
		this.publicEntity = publicEntity;
		this.fundReference = fundReference;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public void setId(long id) {
		this.id = id;
	}

	
	
	public FundRequest() {
		
	}
	


	public long getId() {
		return id;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPublicEntity() {
		return publicEntity;
	}

	public void setPublicEntity(String publicEntity) {
		this.publicEntity = publicEntity;
	}

	public String getFundReference() {
		return fundReference;
	}

	public void setFundReference(String fundReference) {
		this.fundReference = fundReference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
