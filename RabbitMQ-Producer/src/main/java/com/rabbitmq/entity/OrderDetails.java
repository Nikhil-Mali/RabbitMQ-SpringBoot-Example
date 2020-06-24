package com.rabbitmq.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = OrderDetails.class)
public class OrderDetails {

	private Long orderId;
	private String customerName;
	private String foodCategory;
	private List<String> foodItems;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	public List<String> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<String> foodItems) {
		this.foodItems = foodItems;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", customerName=" + customerName + ", foodCategory=" + foodCategory
				+ ", foodItems=" + foodItems + "]";
	}

}
