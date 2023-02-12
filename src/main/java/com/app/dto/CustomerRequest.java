package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class CustomerRequest {

private String custName;
private String custAddress;
private long mobile;
private double balance;

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
	return "CustomerRequest [  custName=" + custName + ", custAddress=" + custAddress + ", mobile="
			+ mobile + ", balance=" + balance + "]";
}

}
