package com.wip.prdemo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductDto {

	private Long pid;
	
	@NotBlank(message = "Product name cannot be empty")
	private String pname;
	
	@Positive(message = "Price must be a Positive Number")
	private int price;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

}
