package com.lti.userdetails;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="userdetails")
public class UserDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long ReferenceId ;
@Temporal(TemporalType.TIMESTAMP)
private	Date	ApplicationDate;
@Column	
private String Firstname;
@Column	
private String Lastname;
@Column	
private String FathersName;
@Temporal(TemporalType.DATE)
private Date DOB; 
@Column	
private  String mobileNo;
@Column	
private String E_mail_id;
@Column	
private String AdharCard;
@Column	
private String PRES_AddressLine1;
@Column	
private String PRES_AddressLine2;
@Column	
private String PRES_City;
@Column	
private String PRES_State;
@Column	
private int PRES_Zipcode;
@Column	
private String PERM_AddressLine1;
@Column	
private String PERM_AddressLine2;
@Column	
private String PERM_City;
@Column	
private String PERM_State;
@Column	
private String PERM_Zipcode;
@Column	
private String OccupationType;
@Column	
private String SourceOfIncome;
@Column	
private String GrossAnnualIncome ;
public long getReferenceId() {
	return ReferenceId;
}
public void setReferenceId(long referenceId) {
	ReferenceId = referenceId;
}
public Date getApplicationDate() {
	return ApplicationDate;
}
public void setApplicationDate(Date applicationDate) {
	ApplicationDate = applicationDate;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getFathersName() {
	return FathersName;
}
public void setFathersName(String fathersName) {
	FathersName = fathersName;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getE_mail_id() {
	return E_mail_id;
}
public void setE_mail_id(String e_mail_id) {
	E_mail_id = e_mail_id;
}
public String getAdharCard() {
	return AdharCard;
}
public void setAdharCard(String adharCard) {
	AdharCard = adharCard;
}
public String getPRES_AddressLine1() {
	return PRES_AddressLine1;
}
public void setPRES_AddressLine1(String pRES_AddressLine1) {
	PRES_AddressLine1 = pRES_AddressLine1;
}
public String getPRES_AddressLine2() {
	return PRES_AddressLine2;
}
public void setPRES_AddressLine2(String pRES_AddressLine2) {
	PRES_AddressLine2 = pRES_AddressLine2;
}
public String getPRES_City() {
	return PRES_City;
}
public void setPRES_City(String pRES_City) {
	PRES_City = pRES_City;
}
public String getPRES_State() {
	return PRES_State;
}
public void setPRES_State(String pRES_State) {
	PRES_State = pRES_State;
}
public int getPRES_Zipcode() {
	return PRES_Zipcode;
}
public void setPRES_Zipcode(int pRES_Zipcode) {
	PRES_Zipcode = pRES_Zipcode;
}
public String getPERM_AddressLine1() {
	return PERM_AddressLine1;
}
public void setPERM_AddressLine1(String pERM_AddressLine1) {
	PERM_AddressLine1 = pERM_AddressLine1;
}
public String getPERM_AddressLine2() {
	return PERM_AddressLine2;
}
public void setPERM_AddressLine2(String pERM_AddressLine2) {
	PERM_AddressLine2 = pERM_AddressLine2;
}
public String getPERM_City() {
	return PERM_City;
}
public void setPERM_City(String pERM_City) {
	PERM_City = pERM_City;
}
public String getPERM_State() {
	return PERM_State;
}
public void setPERM_State(String pERM_State) {
	PERM_State = pERM_State;
}
public String getPERM_Zipcode() {
	return PERM_Zipcode;
}
public void setPERM_Zipcode(String pERM_Zipcode) {
	PERM_Zipcode = pERM_Zipcode;
}
public String getOccupationType() {
	return OccupationType;
}
public void setOccupationType(String occupationType) {
	OccupationType = occupationType;
}
public String getSourceOfIncome() {
	return SourceOfIncome;
}
public void setSourceOfIncome(String sourceOfIncome) {
	SourceOfIncome = sourceOfIncome;
}
public String getGrossAnnualIncome() {
	return GrossAnnualIncome;
}
public void setGrossAnnualIncome(String grossAnnualIncome) {
	GrossAnnualIncome = grossAnnualIncome;
}
}
