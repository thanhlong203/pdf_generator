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
 * EvaluationFile generated by hbm2java
 */
@Entity
@Table(name = "evaluation_file", catalog = "SKILL_MNG")
public class EvaluationFile implements java.io.Serializable {

	private Integer id;
	private int employeeId;
	private Integer uploader;
	private String fileName;
	private String filePath;
	private Date lastModifiedTime;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public EvaluationFile() {
	}

	public EvaluationFile(int employeeId, String filePath, Date insertDatetime) {
		this.employeeId = employeeId;
		this.filePath = filePath;
		this.insertDatetime = insertDatetime;
	}

	public EvaluationFile(int employeeId, Integer uploader, String fileName, String filePath, Date lastModifiedTime,
			Boolean activeFlg, Date insertDatetime, Date updateDatetime) {
		this.employeeId = employeeId;
		this.uploader = uploader;
		this.fileName = fileName;
		this.filePath = filePath;
		this.lastModifiedTime = lastModifiedTime;
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

	@Column(name = "UPLOADER")
	public Integer getUploader() {
		return this.uploader;
	}

	public void setUploader(Integer uploader) {
		this.uploader = uploader;
	}

	@Column(name = "FILE_NAME", length = 100)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FILE_PATH", nullable = false)
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_MODIFIED_TIME", length = 19)
	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
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
