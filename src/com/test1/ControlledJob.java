package com.test1;

public class ControlledJob {
	private Integer ControlJobId;
	private String ControlJobName;
	private String ControlJobScript;
	private String ControlJobStartTime;
	private String ControlJobEndTime;
	private String ControlJobOwner;
	private boolean isActive;
	private String toRunBySupport;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ControlledJob() {

	}

	public ControlledJob(Integer controlJobId, String controlJobName, String controlJobScript,
			String controlJobStartTime, String controlJobEndTime, String controlJobOwner, boolean isActive,
			String toRunBySupport, String creationDate, String modifiedDate, String entityState) {
		super();
		ControlJobId = controlJobId;
		ControlJobName = controlJobName;
		ControlJobScript = controlJobScript;
		ControlJobStartTime = controlJobStartTime;
		ControlJobEndTime = controlJobEndTime;
		ControlJobOwner = controlJobOwner;
		this.isActive = isActive;
		this.toRunBySupport = toRunBySupport;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getControlJobId() {
		return ControlJobId;
	}

	public void setControlJobId(Integer controlJobId) {
		ControlJobId = controlJobId;
	}

	public String getControlJobName() {
		return ControlJobName;
	}

	public void setControlJobName(String controlJobName) {
		ControlJobName = controlJobName;
	}

	public String getControlJobScript() {
		return ControlJobScript;
	}

	public void setControlJobScript(String controlJobScript) {
		ControlJobScript = controlJobScript;
	}

	public String getControlJobStartTime() {
		return ControlJobStartTime;
	}

	public void setControlJobStartTime(String controlJobStartTime) {
		ControlJobStartTime = controlJobStartTime;
	}

	public String getControlJobEndTime() {
		return ControlJobEndTime;
	}

	public void setControlJobEndTime(String controlJobEndTime) {
		ControlJobEndTime = controlJobEndTime;
	}

	public String getControlJobOwner() {
		return ControlJobOwner;
	}

	public void setControlJobOwner(String controlJobOwner) {
		ControlJobOwner = controlJobOwner;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getToRunBySupport() {
		return toRunBySupport;
	}

	public void setToRunBySupport(String toRunBySupport) {
		this.toRunBySupport = toRunBySupport;
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
