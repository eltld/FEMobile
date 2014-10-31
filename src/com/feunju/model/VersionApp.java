package com.feunju.model;

public class VersionApp {

	private Long versionId;
	private Long versionApp;
	
	public VersionApp()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "version ID: "+versionId + " versionApp: "+versionApp;
		
	}
	
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public Long getVersionApp() {
		return versionApp;
	}
	public void setVersionApp(Long versionApp) {
		this.versionApp = versionApp;
	}
	
	
	
	
	
	
}
