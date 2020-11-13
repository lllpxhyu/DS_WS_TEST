package com.sap.csl.sdm.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sap.csl.sdm.ws.bean.Export;
import com.sap.csl.sdm.ws.bean.Stage;

/**
 * SEI
 * @author I504586
 *
 */
@WebService
public interface DsCalculation {
	
	@WebMethod
	public Export get_ds(Integer vesselCapacity, String distanceType, List<Stage> stageList);
	
	

}
