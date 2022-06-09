package org.aerospace.training.coffee.dto;

import java.util.Objects;

public class DrinkDTO {

	private Long id;
	private String name;
	private String size;
	private Integer milligramsCaffeine;
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
	public String toString() {
		return String.format("DrinkDTO [id=%s, name=%s, size=%s, milligramsCaffeine=%s, gramsSugar=%s]", id, name, size,
				milligramsCaffeine, gramsSugar);
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
		DrinkDTO other = (DrinkDTO) obj;
		return Objects.equals(gramsSugar, other.gramsSugar) && Objects.equals(id, other.id)
				&& Objects.equals(milligramsCaffeine, other.milligramsCaffeine) && Objects.equals(name, other.name)
				&& Objects.equals(size, other.size);
	}
	
}
