package com.sap.csl.sdm.ws;

import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sap.csl.sdm.ws.bean.Stage;

@WebService
public interface DataTypeWS {
	
	@WebMethod
	public boolean addStage(Stage s);
	
	@WebMethod
	public Stage getStage(int id);

	@WebMethod
	public Map<Integer, Stage> getAllStagesMap();
}
