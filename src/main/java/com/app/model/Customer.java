package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//a class can be mapped to a table.
@Entity
public class Customer {
//primary key of current entity
@Id

//specify how the primary key should be generated
@GeneratedValue(strategy = GenerationType.AUTO)

private int custId;
private String custName;
private String custAddress;
private long mobile;
private double balance;

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", mobile="
			+ mobile + ", balance=" + balance + "]";
}

}

// This is a simple POJO(Plain Old Java Object) class in java. 
