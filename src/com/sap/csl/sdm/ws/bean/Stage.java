package com.sap.csl.sdm.ws.bean;

public class Stage {
	
	@Override
	public String toString() {
		return "Stage [LOCATION_FROM=" + LOCATION_FROM + ", LATITUDE_FROM=" + LATITUDE_FROM + ", LONGITUDE_FROM="
				+ LONGITUDE_FROM + ", POSTAL_CODE_FROM=" + POSTAL_CODE_FROM + ", LOCATION_TO=" + LOCATION_TO
				+ ", LATITUDE_TO=" + LATITUDE_TO + ", LONGITUDE_TO=" + LONGITUDE_TO + ", POSTAL_CODE_TO="
				+ POSTAL_CODE_TO + ", DEPARTURE_DATE=" + DEPARTURE_DATE + "]";
	}

	private String LOCATION_FROM;
	private float LATITUDE_FROM;
	private float LONGITUDE_FROM;
	private String POSTAL_CODE_FROM;
	private String LOCATION_TO;
	private float LATITUDE_TO;
	private float LONGITUDE_TO;
	private String POSTAL_CODE_TO;
	public String getLOCATION_FROM() {
		return LOCATION_FROM;
	}
	public void setLOCATION_FROM(String lOCATION_FROM) {
		LOCATION_FROM = lOCATION_FROM;
	}
	public float getLATITUDE_FROM() {
		return LATITUDE_FROM;
	}
	public void setLATITUDE_FROM(float lATITUDE_FROM) {
		LATITUDE_FROM = lATITUDE_FROM;
	}
	public float getLONGITUDE_FROM() {
		return LONGITUDE_FROM;
	}
	public void setLONGITUDE_FROM(float lONGITUDE_FROM) {
		LONGITUDE_FROM = lONGITUDE_FROM;
	}
	public String getPOSTAL_CODE_FROM() {
		return POSTAL_CODE_FROM;
	}
	public void setPOSTAL_CODE_FROM(String pOSTAL_CODE_FROM) {
		POSTAL_CODE_FROM = pOSTAL_CODE_FROM;
	}
	public String getLOCATION_TO() {
		return LOCATION_TO;
	}
	public void setLOCATION_TO(String lOCATION_TO) {
		LOCATION_TO = lOCATION_TO;
	}
	public float getLATITUDE_TO() {
		return LATITUDE_TO;
	}
	public void setLATITUDE_TO(float lATITUDE_TO) {
		LATITUDE_TO = lATITUDE_TO;
	}
	public float getLONGITUDE_TO() {
		return LONGITUDE_TO;
	}
	public void setLONGITUDE_TO(float lONGITUDE_TO) {
		LONGITUDE_TO = lONGITUDE_TO;
	}
	public String getPOSTAL_CODE_TO() {
		return POSTAL_CODE_TO;
	}
	public void setPOSTAL_CODE_TO(String pOSTAL_CODE_TO) {
		POSTAL_CODE_TO = pOSTAL_CODE_TO;
	}
	public int getDEPARTURE_DATE() {
		return DEPARTURE_DATE;
	}
	public void setDEPARTURE_DATE(int dEPARTURE_DATE) {
		DEPARTURE_DATE = dEPARTURE_DATE;
	}
	private int DEPARTURE_DATE;
	
}
