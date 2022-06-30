package com.sfdevs.inventory.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	private String id;
	private String name;
	private List<SubCategory> subCategoryList;
	
}
