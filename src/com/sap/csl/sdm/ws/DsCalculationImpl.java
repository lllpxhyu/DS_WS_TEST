package com.sap.csl.sdm.ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

import com.sap.csl.sdm.ws.bean.Export;
import com.sap.csl.sdm.ws.bean.Stage;
import com.sap.csl.sdm.ws.bean.StageResult;

/**
 * SEI Implementation
 * @author I504586
 *
 */
@WebService
public class DsCalculationImpl implements DsCalculation {

	@Override
	public Export get_ds(Integer VESSEL_CAPACITY, String DISTANCE_TYPE, List<Stage> stageList) {
		
		List<StageResult>srList = new ArrayList();
		Export exp = new Export();
		exp.setDISTANCE_TYPE(DISTANCE_TYPE);
		exp.setVESSEL_CAPACITY(VESSEL_CAPACITY);
		System.out.println("Import parameters:");
		System.out.println(" VesselCapacity:" + VESSEL_CAPACITY);
		System.out.println(" distanceType:" + DISTANCE_TYPE);
		
		if( stageList != null ) {
			Iterator it = stageList.iterator();
			while(it.hasNext()) {
				Stage stage = (Stage)it.next();
				StageResult sr = new StageResult();
				sr.setDEPARTURE_DATE(stage.getDEPARTURE_DATE());
				sr.setDistance(100);
				sr.setUnit("KM");
				sr.setLATITUDE_FROM(100);
				sr.setLATITUDE_TO(stage.getLATITUDE_TO());
				sr.setLATITUDE_FROM(0);
				srList.add(sr);
				exp.setList(srList);
				System.out.println("start location: " + stage.getLOCATION_FROM());
				System.out.println("end location: " + stage.getLOCATION_TO());
			}
		}
		return exp;
		
	}

}
