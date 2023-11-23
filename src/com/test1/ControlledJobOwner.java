package com.test1;

public class ControlledJobOwner {
	private Integer systemId;
	private String systemName;
	private String teamDL;
	private String managerName;
	private String techEmpId;
	private String poEmpId;
	private String techContact;
	private String poContact;
	private String teamLocation;
	private String teamAvailability;
	private String craetionDate;
	private String modifiedDate;
	private String entityState;

	public ControlledJobOwner() {

	}

	public ControlledJobOwner(Integer systemId, String systemName, String teamDL, String managerName, String techEmpId,
			String poEmpId, String techContact, String poContact, String teamLocation, String teamAvailability,
			String craetionDate, String modifiedDate, String entityState) {
		super();
		this.systemId = systemId;
		this.systemName = systemName;
		this.teamDL = teamDL;
		this.managerName = managerName;
		this.techEmpId = techEmpId;
		this.poEmpId = poEmpId;
		this.techContact = techContact;
		this.poContact = poContact;
		this.teamLocation = teamLocation;
		this.teamAvailability = teamAvailability;
		this.craetionDate = craetionDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getTeamDL() {
		return teamDL;
	}

	public void setTeamDL(String teamDL) {
		this.teamDL = teamDL;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getTechEmpId() {
		return techEmpId;
	}

	public void setTechEmpId(String techEmpId) {
		this.techEmpId = techEmpId;
	}

	public String getPoEmpId() {
		return poEmpId;
	}

	public void setPoEmpId(String poEmpId) {
		this.poEmpId = poEmpId;
	}

	public String getTechContact() {
		return techContact;
	}

	public void setTechContact(String techContact) {
		this.techContact = techContact;
	}

	public String getPoContact() {
		return poContact;
	}

	public void setPoContact(String poContact) {
		this.poContact = poContact;
	}

	public String getTeamLocation() {
		return teamLocation;
	}

	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}

	public String getTeamAvailability() {
		return teamAvailability;
	}

	public void setTeamAvailability(String teamAvailability) {
		this.teamAvailability = teamAvailability;
	}

	public String getCraetionDate() {
		return craetionDate;
	}

	public void setCraetionDate(String craetionDate) {
		this.craetionDate = craetionDate;
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
