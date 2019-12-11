package com.website.generateEntities;
// Generated 9 Dec, 2019 1:14:57 PM by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private String orderId;
	private String customerAddress;
	private String customerEmail;
	private String customerName;
	private String customerPhone;
	private Date orderDate;
	private int orderNum;

	public Orders() {
	}

	public Orders(String orderId, int orderNum) {
		this.orderId = orderId;
		this.orderNum = orderNum;
	}

	public Orders(String orderId, String customerAddress, String customerEmail, String customerName,
			String customerPhone, Date orderDate, int orderNum) {
		this.orderId = orderId;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.orderDate = orderDate;
		this.orderNum = orderNum;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

}
