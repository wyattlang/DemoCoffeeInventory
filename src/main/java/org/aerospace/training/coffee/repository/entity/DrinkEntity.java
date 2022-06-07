package org.aerospace.training.coffee.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrinkEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String size;
	@Column
	private Integer milligramsCaffeine;
	@Column
	private Integer gramsSugar;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getMilligramsCaffeine() {
		return milligramsCaffeine;
	}
	public void setMilligramsCaffeine(Integer milligramsCaffeine) {
		this.milligramsCaffeine = milligramsCaffeine;
	}
	public Integer getGramsSugar() {
		return gramsSugar;
	}
	public void setGramsSugar(Integer gramsSugar) {
		this.gramsSugar = gramsSugar;
	}
	
}
