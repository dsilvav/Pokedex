/**
 * 
 */
package com.pokemon.entity;
import java.io.Serializable;
import java.util.List;
/**
 * @author dsilva
 *
 */
public class DetailPoke implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String weight;
	private List<Object> abilities;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Object> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Object> abilities) {
		this.abilities = abilities;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
}
