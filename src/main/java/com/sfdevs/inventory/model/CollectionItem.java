package com.sfdevs.inventory.model;

import lombok.Data;

@Data
public class CollectionItem {

	private String id;
	private String name;
	private String categoryId;
	private String subCategoryId;
	
}
