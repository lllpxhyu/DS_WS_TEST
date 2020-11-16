package com.sap.csl.sdm.ws.server;

import javax.xml.ws.Endpoint;

import com.sap.csl.sdm.ws.DsCalculationImpl;

/**
 * Publish Web Service
 * @author I504586
 *
 */
public class ServerTest {

		public static void main(String[] args) {
			
			String sAddress = "http://***.***.***.***:****/sdm_test_ws/DsCalculation";
			Endpoint.publish(sAddress, new DsCalculationImpl());
			System.out.println("publish successfully!!!");
		}
}
