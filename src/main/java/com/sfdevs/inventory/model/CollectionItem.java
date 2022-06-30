package com.sfdevs.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CollectionItem {

	private String id;
	private String name;
	private String categoryId;
	private String subCategoryId;
	
}
