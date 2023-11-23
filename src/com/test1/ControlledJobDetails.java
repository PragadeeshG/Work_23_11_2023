package com.test1;

public class ControlledJobDetails {
	private Integer jobId;
	private String jobPresence;
	private String serverName;
	private String serverIp;
	private String scriptPath;
	private String scriptOwner;
	private String logFileName;
	private String logFilePath;
	private String errorFileName;
	private String errorFileLocation;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ControlledJobDetails() {

	}

	public ControlledJobDetails(Integer jobId, String jobPresence, String serverName, String serverIp,
			String scriptPath, String scriptOwner, String logFileName, String logFilePath, String errorFileName,
			String errorFileLocation, String creationDate, String modifiedDate, String entityState) {
		super();
		this.jobId = jobId;
		this.jobPresence = jobPresence;
		this.serverName = serverName;
		this.serverIp = serverIp;
		this.scriptPath = scriptPath;
		this.scriptOwner = scriptOwner;
		this.logFileName = logFileName;
		this.logFilePath = logFilePath;
		this.errorFileName = errorFileName;
		this.errorFileLocation = errorFileLocation;
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

	public String getJobPresence() {
		return jobPresence;
	}

	public void setJobPresence(String jobPresence) {
		this.jobPresence = jobPresence;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getScriptPath() {
		return scriptPath;
	}

	public void setScriptPath(String scriptPath) {
		this.scriptPath = scriptPath;
	}

	public String getScriptOwner() {
		return scriptOwner;
	}

	public void setScriptOwner(String scriptOwner) {
		this.scriptOwner = scriptOwner;
	}

	public String getLogFileName() {
		return logFileName;
	}

	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}

	public String getLogFilePath() {
		return logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	public String getErrorFileName() {
		return errorFileName;
	}

	public void setErrorFileName(String errorFileName) {
		this.errorFileName = errorFileName;
	}

	public String getErrorFileLocation() {
		return errorFileLocation;
	}

	public void setErrorFileLocation(String errorFileLocation) {
		this.errorFileLocation = errorFileLocation;
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
