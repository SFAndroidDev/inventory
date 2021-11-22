package com.sfdevs.inventory.model;

import java.util.List;

import lombok.Data;

@Data 
public class Category {
	
	private String id;
	private String name;
	private List<SubCategory> subCategoryList;
	

}
