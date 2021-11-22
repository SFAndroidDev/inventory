package com.sfdevs.inventory.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MakeupItem extends CollectionItem{

	private LocalDate expirationDate;
	
}
