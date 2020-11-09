package com.myhu.cheela.main.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class TransactionRecord {
	@Column
	private String custId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	@Id
	private String txnId;
	@Column
	private String txnTime;
	@Column
	private Date unixTime;
	@Column
	private String merchant;
	@Column
	private String longi;
	@Column
	private String category;
	@Column
	private String txnAmnt;
	@Column
	private String lat;
	
	@JsonProperty("custId")
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@JsonProperty("txnId")
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	
	@JsonProperty("txnTime")
	public String getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}
	
	@JsonProperty("unixTime")
	public Date getUnixTime() {
		return unixTime;
	}
	public void setUnixTime(Date unixTime) {
		this.unixTime = unixTime;
	}
	
	@JsonProperty("merchant")
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	
	@JsonProperty("longi")
	public String getLongi() {
		return longi;
	}
	public void setLongi(String longi) {
		this.longi = longi;
	}
	
	@JsonProperty("category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@JsonProperty("txnAmnt")
	public String getTxnAmnt() {
		return txnAmnt;
	}
	public void setTxnAmnt(String txnAmnt) {
		this.txnAmnt = txnAmnt;
	}
	
	@JsonProperty("lat")
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	
}
