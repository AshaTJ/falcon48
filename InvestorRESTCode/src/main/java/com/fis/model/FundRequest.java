package com.fis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq", initialValue=100, allocationSize=1000)
public class FundRequest {
  @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") private long id;
  private String companyName;
  private String description;
  private String publicEntity;
  private String fundReference;

  public FundRequest() {
    super();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public FundRequest(
      long id, String companyName, String description, String publicEntity, String fundReference) {
    super();
    this.id = id;
    this.companyName = companyName;
    this.description = description;
    this.publicEntity = publicEntity;
    this.fundReference = fundReference;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
