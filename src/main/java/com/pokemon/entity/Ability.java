package com.pokemon.entity;

import java.io.Serializable;
import java.util.List;

public class Ability implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Ability> ability;

	public List<Ability> getAbility() {
		return ability;
	}

	public void setAbility(List<Ability> ability) {
		this.ability = ability;
	}


}
