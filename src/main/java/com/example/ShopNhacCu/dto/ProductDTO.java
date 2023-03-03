package com.example.ShopNhacCu.dto;

import lombok.Data;

@Data
public class ProductDTO {
	private Long id;
	private String name;
	
	private int categoryId;
	private double price;
	private int weight;
	private String description;
	private String imageName;
}
