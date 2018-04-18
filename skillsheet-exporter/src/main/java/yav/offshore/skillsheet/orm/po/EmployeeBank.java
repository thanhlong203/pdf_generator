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
 * EmployeeBank generated by hbm2java
 */
@Entity
@Table(name = "employee_bank", catalog = "SKILL_MNG")
public class EmployeeBank implements java.io.Serializable {

	private Integer id;
	private int employeeId;
	private String bankName;
	private Integer bankBranchNo;
	private String bankBranchName;
	private Boolean accountType;
	private String bankAccountNo;
	private Integer lastModifier;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public EmployeeBank() {
	}

	public EmployeeBank(int employeeId, Date insertDatetime) {
		this.employeeId = employeeId;
		this.insertDatetime = insertDatetime;
	}

	public EmployeeBank(int employeeId, String bankName, Integer bankBranchNo, String bankBranchName,
			Boolean accountType, String bankAccountNo, Integer lastModifier, Boolean activeFlg, Date insertDatetime,
			Date updateDatetime) {
		this.employeeId = employeeId;
		this.bankName = bankName;
		this.bankBranchNo = bankBranchNo;
		this.bankBranchName = bankBranchName;
		this.accountType = accountType;
		this.bankAccountNo = bankAccountNo;
		this.lastModifier = lastModifier;
		this.activeFlg = activeFlg;
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

	@Column(name = "EMPLOYEE_ID", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "BANK_NAME", length = 100)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BANK_BRANCH_NO")
	public Integer getBankBranchNo() {
		return this.bankBranchNo;
	}

	public void setBankBranchNo(Integer bankBranchNo) {
		this.bankBranchNo = bankBranchNo;
	}

	@Column(name = "BANK_BRANCH_NAME", length = 100)
	public String getBankBranchName() {
		return this.bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	@Column(name = "ACCOUNT_TYPE", precision = 1, scale = 0)
	public Boolean getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Boolean accountType) {
		this.accountType = accountType;
	}

	@Column(name = "BANK_ACCOUNT_NO", length = 10)
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	@Column(name = "LAST_MODIFIER")
	public Integer getLastModifier() {
		return this.lastModifier;
	}

	public void setLastModifier(Integer lastModifier) {
		this.lastModifier = lastModifier;
	}

	@Column(name = "ACTIVE_FLG", precision = 1, scale = 0)
	public Boolean getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(Boolean activeFlg) {
		this.activeFlg = activeFlg;
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
