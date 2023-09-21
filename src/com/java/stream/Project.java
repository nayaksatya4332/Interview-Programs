package com.java.stream;

public class Project {
	private int pId;
	private String projectName;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String projectName) {
		super();
		this.pId = pId;
		this.projectName = projectName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", projectName=" + projectName + "]";
	}
}
