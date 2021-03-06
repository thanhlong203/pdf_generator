package yav.offshore.skillsheet.orm.po;
// Generated Apr 16, 2018 11:28:39 AM by Hibernate Tools 5.1.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmployeeProfile generated by hbm2java
 */
@Entity
@Table(name = "employee_profile", catalog = "SKILL_MNG")
public class EmployeeProfile implements java.io.Serializable {

	private Integer id;
	private String loginId;
	private int groupId;
	private String firstNameKana;
	private String lastNameKana;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Boolean gender;
	private Date birthday;
	private String retirementCode;
	private String unemploymentInsuranceCode;
	private String zipCode;
	private String mainAddress;
	private String addressNumber;
	private String houseNumber;
	private String nearestStation;
	private Date prejobEndDate;
	private Boolean status;
	private Integer saleId;
	private String businessType;
	private Integer createdBy;
	private String password;
	private String passwordStatus;
	private Integer passwordExpirePolicy;
	private Date passwordExpireTime;
	private boolean activeFlg;
	private Date lastUpdateDatetime;
	private Date insertDatetime;
	private Date updateDatetime;

	public EmployeeProfile() {
	}

	public EmployeeProfile(String loginId, int groupId, boolean activeFlg, Date insertDatetime) {
		this.loginId = loginId;
		this.groupId = groupId;
		this.activeFlg = activeFlg;
		this.insertDatetime = insertDatetime;
	}

	public EmployeeProfile(String loginId, int groupId, String firstNameKana, String lastNameKana, String firstName,
			String lastName, String email, String phone, Boolean gender, Date birthday, String retirementCode,
			String unemploymentInsuranceCode, String zipCode, String mainAddress, String addressNumber,
			String houseNumber, String nearestStation, Date prejobEndDate, Boolean status, Integer saleId,
			String businessType, Integer createdBy, String password, String passwordStatus,
			Integer passwordExpirePolicy, Date passwordExpireTime, boolean activeFlg, Date lastUpdateDatetime,
			Date insertDatetime, Date updateDatetime) {
		this.loginId = loginId;
		this.groupId = groupId;
		this.firstNameKana = firstNameKana;
		this.lastNameKana = lastNameKana;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.birthday = birthday;
		this.retirementCode = retirementCode;
		this.unemploymentInsuranceCode = unemploymentInsuranceCode;
		this.zipCode = zipCode;
		this.mainAddress = mainAddress;
		this.addressNumber = addressNumber;
		this.houseNumber = houseNumber;
		this.nearestStation = nearestStation;
		this.prejobEndDate = prejobEndDate;
		this.status = status;
		this.saleId = saleId;
		this.businessType = businessType;
		this.createdBy = createdBy;
		this.password = password;
		this.passwordStatus = passwordStatus;
		this.passwordExpirePolicy = passwordExpirePolicy;
		this.passwordExpireTime = passwordExpireTime;
		this.activeFlg = activeFlg;
		this.lastUpdateDatetime = lastUpdateDatetime;
		this.insertDatetime = insertDatetime;
		this.updateDatetime = updateDatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "LOGIN_ID", nullable = false, length = 10)
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	@Column(name = "GROUP_ID", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "FIRST_NAME_KANA", length = 100)
	public String getFirstNameKana() {
		return this.firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	@Column(name = "LAST_NAME_KANA", length = 100)
	public String getLastNameKana() {
		return this.lastNameKana;
	}

	public void setLastNameKana(String lastNameKana) {
		this.lastNameKana = lastNameKana;
	}

	@Column(name = "FIRST_NAME", length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "GENDER", precision = 1, scale = 0)
	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY", length = 10)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "RETIREMENT_CODE", length = 15)
	public String getRetirementCode() {
		return this.retirementCode;
	}

	public void setRetirementCode(String retirementCode) {
		this.retirementCode = retirementCode;
	}

	@Column(name = "UNEMPLOYMENT_INSURANCE_CODE", length = 15)
	public String getUnemploymentInsuranceCode() {
		return this.unemploymentInsuranceCode;
	}

	public void setUnemploymentInsuranceCode(String unemploymentInsuranceCode) {
		this.unemploymentInsuranceCode = unemploymentInsuranceCode;
	}

	@Column(name = "ZIP_CODE", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "MAIN_ADDRESS")
	public String getMainAddress() {
		return this.mainAddress;
	}

	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	@Column(name = "ADDRESS_NUMBER", length = 10)
	public String getAddressNumber() {
		return this.addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	@Column(name = "HOUSE_NUMBER")
	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Column(name = "NEAREST_STATION")
	public String getNearestStation() {
		return this.nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PREJOB_END_DATE", length = 10)
	public Date getPrejobEndDate() {
		return this.prejobEndDate;
	}

	public void setPrejobEndDate(Date prejobEndDate) {
		this.prejobEndDate = prejobEndDate;
	}

	@Column(name = "STATUS", precision = 1, scale = 0)
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "SALE_ID")
	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	@Column(name = "BUSINESS_TYPE", length = 50)
	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Column(name = "CREATED_BY")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "PASSWORD", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PASSWORD_STATUS", length = 10)
	public String getPasswordStatus() {
		return this.passwordStatus;
	}

	public void setPasswordStatus(String passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	@Column(name = "PASSWORD_EXPIRE_POLICY")
	public Integer getPasswordExpirePolicy() {
		return this.passwordExpirePolicy;
	}

	public void setPasswordExpirePolicy(Integer passwordExpirePolicy) {
		this.passwordExpirePolicy = passwordExpirePolicy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PASSWORD_EXPIRE_TIME", length = 19)
	public Date getPasswordExpireTime() {
		return this.passwordExpireTime;
	}

	public void setPasswordExpireTime(Date passwordExpireTime) {
		this.passwordExpireTime = passwordExpireTime;
	}

	@Column(name = "ACTIVE_FLG", nullable = false, precision = 1, scale = 0)
	public boolean isActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DATETIME", length = 19)
	public Date getLastUpdateDatetime() {
		return this.lastUpdateDatetime;
	}

	public void setLastUpdateDatetime(Date lastUpdateDatetime) {
		this.lastUpdateDatetime = lastUpdateDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_DATETIME", nullable = false, length = 19)
	public Date getInsertDatetime() {
		return this.insertDatetime;
	}

	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATETIME", length = 19)
	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}
