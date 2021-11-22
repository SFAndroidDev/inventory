package com.sfdevs.inventory.model;

import java.util.List;

import lombok.Data;

@Data
public class Collection {

	private String id;
	private String name;
	private List<CollectionItem> collectionItemList;
}
