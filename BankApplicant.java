package com.sbi.admin.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="applicant")
public class BankApplicant {

	@Id
	@Column(name="applicant_id")
	private int applicantId;
	
	
	@Column(name="Applying_for")
	private String applyingFor;
			  
	
	@Column(name="Application_Date")
	private Date applicationDate;		 
			  
	
	@Column(name="Application_Status")
	private String applicationStatus;	
			  
	
	@Column(name="Title")
	private String title;
			  
	@Column(name="First_name")
	private String firstName;
	
	
	@Column(name="Middle_name")
	private String middleName;
	
	@Column(name="Last_name")
	private String lastName;
	
	
	@Column(name="DateOfBirth")
	private Date dateOfBirth;
	
	
	@Column(name="Gender")
	private String gender;
	
	
	@Column(name="Marital_status")
	private String maritalStatus;
	
	@Column(name="Religion")
	private String religion;

	@Column(name="Father_Name")
	private String fatherName;
	
	@Column(name="Mother_name")
	private String motherName;
	
	@Column(name="Spouse_name")
	private String spouseName;
	
	@Column(name="Id_Type")
	private String idType;
	
	
	@Column(name="Id_Number")
	private String idNumber;
	
	@Column(name="Pan_Card")
	private String panCard;			 
			
	@Column(name="Phone_Number")
	private Long phoneNumber;	
	
	@Column(name="email")
	private String email;	
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Nominee_Name")
	private String nomineeName;
			 
	@Column(name="Nominee_DOB")
	private Date NomineeDOB;
	
	@Column(name="Nominee_Relationship")
	private String nomineeRelationship;
	
	@Column(name="Nominee_Address")
	private String nomineeAddress;
			
	@Column(name="Guardian_Name")
	private String guardianName;
	
	@Column(name="Guardian_Address")
	private String guardianAddress;
	
	@Column(name="Educational_Qualification")
	private String eduQualification;
	
	@Column(name="Occupation_Type")
	private String occupation;
	
	@Column(name="Annual_Income")
	private Long annualIncome;

	@Column(name="remarks")
	private String remarks;
	
	
	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplyingFor() {
		return applyingFor;
	}

	public void setApplyingFor(String applyingFor) {
		this.applyingFor = applyingFor;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public Date getNomineeDOB() {
		return NomineeDOB;
	}

	public void setNomineeDOB(Date nomineeDOB) {
		NomineeDOB = nomineeDOB;
	}

	public String getNomineeRelationship() {
		return nomineeRelationship;
	}

	public void setNomineeRelationship(String nomineeRelationship) {
		this.nomineeRelationship = nomineeRelationship;
	}

	public String getNomineeAddress() {
		return nomineeAddress;
	}

	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianAddress() {
		return guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public String getEduQualification() {
		return eduQualification;
	}

	public void setEduQualification(String eduQualification) {
		this.eduQualification = eduQualification;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Long getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Long annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

		
}
