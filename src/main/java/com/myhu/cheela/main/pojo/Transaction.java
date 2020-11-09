package com.myhu.cheela.main.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {
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
	private String Category;
	@Column
	private String merchant;
	@Column
	private String TxnAmnt;
	@Column
	private String longi;
	@Column
	private String Lat;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(String string) {
		this.txnTime = string;
	}

	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getTxnAmnt() {
		return TxnAmnt;
	}
	public void setTxnAmnt(String txnAmnt) {
		TxnAmnt = txnAmnt;
	}
	public String getLongi() {
		return longi;
	}
	public void setLongi(String longi) {
		this.longi = longi;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
}
