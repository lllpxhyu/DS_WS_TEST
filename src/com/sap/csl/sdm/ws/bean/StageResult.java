package com.sap.csl.sdm.ws.bean;

public class StageResult extends Stage {
	
	private Integer distance;
	private String unit;
	@Override
	public String toString() {
		return "StageResult [distance=" + distance + ", unit=" + unit + ", toString()=" + super.toString()
				+ ", getLOCATION_FROM()=" + getLOCATION_FROM() + ", getLATITUDE_FROM()=" + getLATITUDE_FROM()
				+ ", getLONGITUDE_FROM()=" + getLONGITUDE_FROM() + ", getPOSTAL_CODE_FROM()=" + getPOSTAL_CODE_FROM()
				+ ", getLOCATION_TO()=" + getLOCATION_TO() + ", getLATITUDE_TO()=" + getLATITUDE_TO()
				+ ", getLONGITUDE_TO()=" + getLONGITUDE_TO() + ", getPOSTAL_CODE_TO()=" + getPOSTAL_CODE_TO()
				+ ", getDEPARTURE_DATE()=" + getDEPARTURE_DATE() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
