package com.innovatis.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HR_HR")
public class Hr {
	private int id;
	private String hrId;
	private String t1Id;
	private String t1Name;
	private String t2Id;
	private String t2Name;
	private String t3Id;
	private String t3Name;
	private String name;
	private String address;
	private String postcode;
	private String designation;
	private String posCatId;
	private String posCatName;
	private String posId;
	private String posName;
	private String telephone;
	private String mobile;
	private String bank;
	private String account;
	private String qq;
	private String email;
	private String hobby;
	private String speciality;
	private String sex;
	private String religion;
	private String party;
	private String nationality;
	private String race;
	private String birthday;
	private String birthplace;
	private int age;
	private String eduDegree;
	private String eduYears;
	private String eduMajor;
	private String ssn;
	private String idCard;
	private String remark;
	private String salId;
	private String salName;
	private float salSum;
	private float demandSalSum;
	private float paidSalSum;
	private int majorChangeAmount;
	private int bonusAmount;
	private int trainAmount;
	private int fileChangeAmount;
	private String historyRec;
	private String familyMem;
	private String pic;
	private String attachmentName;
	private int checkStatus;
	private String register;
	private String checker;
	private String changer;
	private Timestamp regTime;
	private Timestamp checkTime;
	private Timestamp changeTime;
	private Timestamp lastChangeTime;
	private Timestamp delTime;
	private Timestamp recoveryTime;
	private int fileStatus;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_seq")
	@SequenceGenerator(name = "gen_seq", sequenceName = "hr_hr_seq", allocationSize = 1)
	@Column(name="HUF_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="HUMAN_ID")
	public String getHrId() {
		return hrId;
	}

	public void setHrId(String hrId) {
		this.hrId = hrId;
	}
	@Column(name="FIRST_KIND_ID")
	public String getT1Id() {
		return t1Id;
	}

	public void setT1Id(String t1Id) {
		this.t1Id = t1Id;
	}
	@Column(name="FIRST_KIND_NAME")
	public String getT1Name() {
		return t1Name;
	}

	public void setT1Name(String t1Name) {
		this.t1Name = t1Name;
	}
	@Column(name="SECOND_KIND_ID")
	public String getT2Id() {
		return t2Id;
	}

	public void setT2Id(String t2Id) {
		this.t2Id = t2Id;
	}
	@Column(name="SECOND_KIND_NAME")
	public String getT2Name() {
		return t2Name;
	}

	public void setT2Name(String t2Name) {
		this.t2Name = t2Name;
	}
	@Column(name="THIRD_KIND_ID")
	public String getT3Id() {
		return t3Id;
	}

	public void setT3Id(String t3Id) {
		this.t3Id = t3Id;
	}
	@Column(name="THIRD_KIND_NAME")
	public String getT3Name() {
		return t3Name;
	}

	public void setT3Name(String t3Name) {
		this.t3Name = t3Name;
	}
	@Column(name="HUMAN_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="HUMAN_ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="HUMAN_POSTCODE")
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Column(name="HUMAN_PRO_DESIGNATON")
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name="HUMAN_MAJOR_KIND_ID")
	public String getPosCatId() {
		return posCatId;
	}

	public void setPosCatId(String posCatId) {
		this.posCatId = posCatId;
	}
	@Column(name="HUMAN_MAJOR_KIND_NAME")
	public String getPosCatName() {
		return posCatName;
	}

	public void setPosCatName(String posCatName) {
		this.posCatName = posCatName;
	}
	@Column(name="HUMAN_MAJOR_ID")
	public String getPosId() {
		return posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}
	@Column(name="HUMAN_MAJOR_NAME")
	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}
	@Column(name="HUMAN_TELEPHONE")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Column(name="HUMAN_MOBILEPHONE")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Column(name="HUMAN_BANK")
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	@Column(name="HUMAN_ACCOUNT")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name="HUMAN_QQ")
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	@Column(name="HUMAN_EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="HUMAN_HOBBY")
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Column(name="HUMAN_SPECIALITY")
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Column(name="HUMAN_SEX")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Column(name="HUMAN_RELIGION")
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}
	@Column(name="HUMAN_PARTY")
	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}
	@Column(name="HUMAN_NATIONALITY")
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Column(name="HUMAN_RACE")
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	@Column(name="HUMAN_BIRTHDAY")
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Column(name="HUMAN_BIRTHPLACE")
	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	@Column(name="HUMAN_AGE")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="HUMAN_EDUCATED_DEGREE")
	public String getEduDegree() {
		return eduDegree;
	}

	public void setEduDegree(String eduDegree) {
		this.eduDegree = eduDegree;
	}
	@Column(name="HUMAN_EDUCATED_YEARS")
	public String getEduYears() {
		return eduYears;
	}

	public void setEduYears(String eduYears) {
		this.eduYears = eduYears;
	}
	@Column(name="HUMAN_EDUCATED_MAJOR")
	public String getEduMajor() {
		return eduMajor;
	}

	public void setEduMajor(String eduMajor) {
		this.eduMajor = eduMajor;
	}
	@Column(name="HUMAN_SOCIETY_SECURITY_ID")
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Column(name="HUMAN_ID_CARD")
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	@Column(name="REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name="SALARY_STANDARD_ID")
	public String getSalId() {
		return salId;
	}

	public void setSalId(String salId) {
		this.salId = salId;
	}
	@Column(name="SALARY_STANDARD_NAME")
	public String getSalName() {
		return salName;
	}

	public void setSalName(String salName) {
		this.salName = salName;
	}
	@Column(name="SALARY_SUM")
	public float getSalSum() {
		return salSum;
	}

	public void setSalSum(float salSum) {
		this.salSum = salSum;
	}
	@Column(name="DAMAND_SALARY_SUM")
	public float getDemandSalSum() {
		return demandSalSum;
	}

	public void setDemandSalSum(float demandSalSum) {
		this.demandSalSum = demandSalSum;
	}
	@Column(name="PAID_SALARY_SUM")
	public float getPaidSalSum() {
		return paidSalSum;
	}

	public void setPaidSalSum(float paidSalSum) {
		this.paidSalSum = paidSalSum;
	}
	@Column(name="MAJOR_CHANGE_AMOUNT")
	public int getMajorChangeAmount() {
		return majorChangeAmount;
	}

	public void setMajorChangeAmount(int majorChangeAmount) {
		this.majorChangeAmount = majorChangeAmount;
	}
	@Column(name="BONUS_AMOUNT")
	public int getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(int bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	@Column(name="TRAINING_AMOUNT")
	public int getTrainAmount() {
		return trainAmount;
	}

	public void setTrainAmount(int trainAmount) {
		this.trainAmount = trainAmount;
	}
	@Column(name="FILE_CHANG_AMOUNT")
	public int getFileChangeAmount() {
		return fileChangeAmount;
	}

	public void setFileChangeAmount(int fileChangeAmount) {
		this.fileChangeAmount = fileChangeAmount;
	}
	@Column(name="HUMAN_HISTROY_RECORDS")
	public String getHistoryRec() {
		return historyRec;
	}

	public void setHistoryRec(String historyRec) {
		this.historyRec = historyRec;
	}
	@Column(name="HUMAN_FAMILY_MEMBERSHIP")
	public String getFamilyMem() {
		return familyMem;
	}

	public void setFamilyMem(String familyMem) {
		this.familyMem = familyMem;
	}
	@Column(name="HUMAN_PICTURE")
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	@Column(name="ATTACHMENT_NAME")
	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	@Column(name="CHECK_STATUS")
	public int getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}
	@Column(name="REGISTER")
	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}
	@Column(name="CHECKER")
	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}
	@Column(name="CHANGER")
	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}
	@Column(name="REGIST_TIME")
	public Timestamp getRegTime() {
		return regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	@Column(name="CHECK_TIME")
	public Timestamp getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}
	@Column(name="CHANGE_TIME")
	public Timestamp getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}
	@Column(name="LASTLY_CHANGE_TIME")
	public Timestamp getLastChangeTime() {
		return lastChangeTime;
	}

	public void setLastChangeTime(Timestamp lastChangeTime) {
		this.lastChangeTime = lastChangeTime;
	}
	@Column(name="DELETE_TIME")
	public Timestamp getDelTime() {
		return delTime;
	}

	public void setDelTime(Timestamp delTime) {
		this.delTime = delTime;
	}
	@Column(name="RECOVERY_TIME")
	public Timestamp getRecoveryTime() {
		return recoveryTime;
	}

	public void setRecoveryTime(Timestamp recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	@Column(name="HUMAN_FILE_STATUS")
	public int getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}

}
