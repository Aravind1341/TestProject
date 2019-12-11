package com.qa.restassured;

public class Topup {
	public String getPlatformcode() {
		return platformcode;
	}
	public void setPlatformcode(String platformcode) {
		this.platformcode = platformcode;
	}
	public String getUserEntityId() {
		return userEntityId;
	}
	public void setUserEntityId(String userEntityId) {
		this.userEntityId = userEntityId;
	}
	public String getWalletId() {
		return walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getDigitalAssetTypeCode() {
		return digitalAssetTypeCode;
	}
	public void setDigitalAssetTypeCode(String digitalAssetTypeCode) {
		this.digitalAssetTypeCode = digitalAssetTypeCode;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getPlatformRef() {
		return platformRef;
	}
	public void setPlatformRef(String platformRef) {
		this.platformRef = platformRef;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "Topup [platformcode=" + platformcode + ", userEntityId=" + userEntityId + ", walletId=" + walletId
				+ ", digitalAssetTypeCode=" + digitalAssetTypeCode + ", quantity=" + quantity + ", terminalId="
				+ terminalId + ", platformRef=" + platformRef + ", timestamp=" + timestamp + ", remarks=" + remarks
				+ ", getPlatformcode()=" + getPlatformcode() + ", getUserEntityId()=" + getUserEntityId()
				+ ", getWalletId()=" + getWalletId() + ", getDigitalAssetTypeCode()=" + getDigitalAssetTypeCode()
				+ ", getQuantity()=" + getQuantity() + ", getTerminalId()=" + getTerminalId() + ", getPlatformRef()="
				+ getPlatformRef() + ", getTimestamp()=" + getTimestamp() + ", getRemarks()=" + getRemarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	private String platformcode;
	private String userEntityId;
	private String walletId;
	private String digitalAssetTypeCode;
	private String quantity;
	private String terminalId;
	private String platformRef;
	private String timestamp;
	private String remarks;
	
	

	
	
	
}
