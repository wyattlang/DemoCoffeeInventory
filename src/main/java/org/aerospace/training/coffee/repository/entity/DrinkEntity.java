package org.aerospace.training.coffee.repository.entity;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(gramsSugar, id, milligramsCaffeine, name, size);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrinkEntity other = (DrinkEntity) obj;
		return Objects.equals(gramsSugar, other.gramsSugar) && Objects.equals(id, other.id)
				&& Objects.equals(milligramsCaffeine, other.milligramsCaffeine) && Objects.equals(name, other.name)
				&& Objects.equals(size, other.size);
	}
	
}
