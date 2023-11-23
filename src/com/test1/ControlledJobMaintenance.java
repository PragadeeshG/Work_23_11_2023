package com.test1;

public class ControlledJobMaintenance {
	private Integer jobId;
	private String isRunBy;
	private boolean shutdownApplicable;
	private String shutDownMailSent;
	private String emailTo;
	private String cc;
	private String bcc;
	private Boolean emailTemplate;
	private String timeZone;
	private String teamContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ControlledJobMaintenance() {

	}

	public ControlledJobMaintenance(Integer jobId, String isRunBy, boolean shutdownApplicable, String shutDownMailSent,
			String emailTo, String cc, String bcc, Boolean emailTemplate, String timeZone, String teamContact,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.jobId = jobId;
		this.isRunBy = isRunBy;
		this.shutdownApplicable = shutdownApplicable;
		this.shutDownMailSent = shutDownMailSent;
		this.emailTo = emailTo;
		this.cc = cc;
		this.bcc = bcc;
		this.emailTemplate = emailTemplate;
		this.timeZone = timeZone;
		this.teamContact = teamContact;
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

	public String getIsRunBy() {
		return isRunBy;
	}

	public void setIsRunBy(String isRunBy) {
		this.isRunBy = isRunBy;
	}

	public boolean isShutdownApplicable() {
		return shutdownApplicable;
	}

	public void setShutdownApplicable(boolean shutdownApplicable) {
		this.shutdownApplicable = shutdownApplicable;
	}

	public String getShutDownMailSent() {
		return shutDownMailSent;
	}

	public void setShutDownMailSent(String shutDownMailSent) {
		this.shutDownMailSent = shutDownMailSent;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public Boolean getEmailTemplate() {
		return emailTemplate;
	}

	public void setEmailTemplate(Boolean emailTemplate) {
		this.emailTemplate = emailTemplate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTeamContact() {
		return teamContact;
	}

	public void setTeamContact(String teamContact) {
		this.teamContact = teamContact;
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
