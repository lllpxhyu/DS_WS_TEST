package com.sap.csl.sdm.ws.bean;

import java.util.List;

public class Export {
	
	private Integer VESSEL_CAPACITY;
	private String DISTANCE_TYPE;
	private List<StageResult> list;
	public Integer getVESSEL_CAPACITY() {
		return VESSEL_CAPACITY;
	}
	public void setVESSEL_CAPACITY(Integer vESSEL_CAPACITY) {
		VESSEL_CAPACITY = vESSEL_CAPACITY;
	}
	@Override
	public String toString() {
		return "Export [VESSEL_CAPACITY=" + VESSEL_CAPACITY + ", DISTANCE_TYPE=" + DISTANCE_TYPE + ", list=" + list
				+ ", getVESSEL_CAPACITY()=" + getVESSEL_CAPACITY() + ", getDISTANCE_TYPE()=" + getDISTANCE_TYPE()
				+ ", getList()=" + getList() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getDISTANCE_TYPE() {
		return DISTANCE_TYPE;
	}
	public void setDISTANCE_TYPE(String dISTANCE_TYPE) {
		DISTANCE_TYPE = dISTANCE_TYPE;
	}
	public List<StageResult> getList() {
		return list;
	}
	public void setList(List<StageResult> list) {
		this.list = list;
	}
	

}
