package com.example.dto;


public class Product {
	private Integer id;
	private String productName;
	private String channel;
	private String serverPort;

	public Integer getProductId() {
		return id;
	}


	public void setProductId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}
	

	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}


	public String getServerPort() {
		return serverPort;
	}


	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	
}
