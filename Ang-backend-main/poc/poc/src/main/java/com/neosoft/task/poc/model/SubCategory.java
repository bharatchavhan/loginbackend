package com.neosoft.task.poc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString

@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int subCategoryId;
	private String subCategoryName;

}
