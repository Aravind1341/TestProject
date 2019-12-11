package com.qa.restassured;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topup obj = new Topup();
		obj.setPlatformcode("00001");
		obj.setUserEntityId("CUST00110212MTEST");
		obj.setWalletId("MPW00109615");
		obj.setDigitalAssetTypeCode("DGC04");
		obj.setQuantity("0.000000001");
		obj.setTerminalId("T5070080XJ5");
		obj.setPlatformRef("MERCH0187");
		obj.setTimestamp("20190412111910");
		obj.setRemarks("956");
		
	/* If we want to reduce the code, then use the below print statement  	
	System.out.println(obj.toString());
	*/
		
	System.out.println("platformCode = " +obj.getPlatformcode());
	System.out.println("userEntityId = " +obj.getUserEntityId());
	System.out.println("walletId = "+obj.getWalletId());
	System.out.println("digitalAssetTypeCode = "+obj.getDigitalAssetTypeCode());
	System.out.println("quantity = "+obj.getQuantity());
	System.out.println("terminalId = "+obj.getTerminalId());
	System.out.println("platformRef = "+obj.getPlatformRef());
	System.out.println("timestamp = "+obj.getTimestamp());
	System.out.println("remarks = "+obj.getRemarks());


	}

}
