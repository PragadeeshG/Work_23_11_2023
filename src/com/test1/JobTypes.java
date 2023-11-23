package com.test1;

public class JobTypes {
	private Integer jobId;
	private String jobTypeId;
	private String jobTypeCode;
	private String jobTypeDesc;
	private String jobTypeShortDesc;
	private String jobReference;
	private String isActive;
	private String jobSource;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public JobTypes() {

	}

	public JobTypes(Integer jobId, String jobTypeId, String jobTypeCode, String jobTypeDesc, String jobTypeShortDesc,
			String jobReference, String isActive, String jobSource, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.jobId = jobId;
		this.jobTypeId = jobTypeId;
		this.jobTypeCode = jobTypeCode;
		this.jobTypeDesc = jobTypeDesc;
		this.jobTypeShortDesc = jobTypeShortDesc;
		this.jobReference = jobReference;
		this.isActive = isActive;
		this.jobSource = jobSource;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobTypeId() {
		return jobTypeId;
	}

	public void setJobTypeId(String jobTypeId) {
		this.jobTypeId = jobTypeId;
	}

	public String getJobTypeCode() {
		return jobTypeCode;
	}

	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}

	public String getJobTypeDesc() {
		return jobTypeDesc;
	}

	public void setJobTypeDesc(String jobTypeDesc) {
		this.jobTypeDesc = jobTypeDesc;
	}

	public String getJobTypeShortDesc() {
		return jobTypeShortDesc;
	}

	public void setJobTypeShortDesc(String jobTypeShortDesc) {
		this.jobTypeShortDesc = jobTypeShortDesc;
	}

	public String getJobReference() {
		return jobReference;
	}

	public void setJobReference(String jobReference) {
		this.jobReference = jobReference;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getJobSource() {
		return jobSource;
	}

	public void setJobSource(String jobSource) {
		this.jobSource = jobSource;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
