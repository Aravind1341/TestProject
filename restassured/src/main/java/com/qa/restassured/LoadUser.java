package com.qa.restassured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test
public class LoadUser {

	public void postReq() {
	
		RestAssured.baseURI = "http://192.168.0.194:8181/0.1/fe-api-gw";

		HashMap<String, String> loadUserMap = new HashMap<String, String>();

		loadUserMap.put("platformCode", "00001");
		loadUserMap.put("terminalId", "T0000004");
		loadUserMap.put("name", "Player 1");
		loadUserMap.put("mobileNo", "8765987");
		loadUserMap.put("userEntityIdentityType", "PASSPORT");
		loadUserMap.put("userEntityIdentity", "G19992244X");
		loadUserMap.put("userEntityType", "PLAYER");
		loadUserMap.put("address1", "Jewelry Trade Center Building");
		loadUserMap.put("address2", "Silom Road");
		loadUserMap.put("address3", "Bangrak");
		loadUserMap.put("postalCode", "10500");
		loadUserMap.put("city", "SG");
		loadUserMap.put("countryCode", "SG");
		loadUserMap.put("timestamp", "20190412111910");
		loadUserMap.put("state", "SG");
		loadUserMap.put("emailId", "manikannanmarimuthu@gmail.com");
		
		Response res = given().header("Content-Type", "application/json").body(loadUserMap).log().body().when()
				.post("/onboard").then().assertThat().and().statusCode(200).contentType(ContentType.JSON).log().body()
				.extract().response();
		String responseAsString = res.asString();
		JsonPath js = new JsonPath(responseAsString);
		String userEntityId = js.get("userEntityId");
		String walletId = js.get("walletId");
		System.out.println("User Entity ID : " + userEntityId + "  walletId : " + walletId);

		HashMap<String, String> topupMap = new HashMap<String, String>();

		topupMap.put("platformCode", "00001");
		topupMap.put("userEntityId", userEntityId);
		topupMap.put("walletId", walletId);
		topupMap.put("digitalAssetTypeCode", "DGC04");
		topupMap.put("quantity", "12");
		topupMap.put("terminalId", "T5070080XJ5");
		topupMap.put("timestamp", "20190412111910");
		topupMap.put("platformRef", "MERCH0187");
		topupMap.put("remarks", "986");

		Response res1 = given().header("Content-Type", "application/json").body(topupMap).log().body().when()
				.post("/topup").then().log().body().assertThat().and().statusCode(200).contentType(ContentType.JSON)
				.extract().response();
		String responseAsString1 = res1.asString();
		JsonPath js1 = new JsonPath(responseAsString1);
		System.out.println("User digitalAssetTypeCode: " + js1.get("digitalAssetTypeCode") + "  availableQuantity : "
				+ js1.get("availableQuantity"));
	}
	
	

}
