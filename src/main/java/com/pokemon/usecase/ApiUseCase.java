/**
 * 
 */
package com.pokemon.usecase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pokemon.entity.DetailPoke;
import com.pokemon.entity.Pokemon;
import com.pokemon.entity.Results;

/**
 * @author dsilva
 *
 */

@Service
public class ApiUseCase {
	
	private RestTemplate restTemplate;

	@Autowired
	public ApiUseCase(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Cacheable("pokemons")
	public List<DetailPoke> getPokeInfo(int offset) {
	
	String url = "https://pokeapi.co/api/v2/pokemon/?offset=";
	String params = String.valueOf(offset);
	List<DetailPoke> data = new ArrayList<>();
	try {
		Pokemon ans =  restTemplate.getForObject(url+params, Pokemon.class);
		
		for(Results link: ans.getResults()) {
			data.add(getDetailByPoke(link.getUrl()));
		} 
	} catch(Exception e) {}
	return data;
	}
	

	
	public DetailPoke getDetailByPoke(String urlPoke) {
		
	String url = urlPoke;
	return restTemplate.getForObject(url, DetailPoke.class);
	}
	
	@Cacheable("pokemons")
	public Object getPokeInfoById(int id) {
		
	String url = "https://pokeapi.co/api/v2/evolution-chain/{id}";
	String params = String.valueOf(id);
	return restTemplate.getForObject(url, Object.class, params);
	}
}
