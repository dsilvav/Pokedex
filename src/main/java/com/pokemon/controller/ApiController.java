/**
 * 
 */
package com.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.entity.DetailPoke;

import com.pokemon.usecase.ApiUseCase;

import io.swagger.annotations.ApiOperation;

/**
 * @author dsilva
 *
 */

@RestController
@RequestMapping("/pokemon")
public class ApiController {
		
	@Autowired
	ApiUseCase uac;
	
	@GetMapping(value = "/generalInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Getting general info for each pokemon available in PokeApi.")
	public ResponseEntity<List<DetailPoke>> getAllPokeInfo(int offset) {
		return new ResponseEntity<>(uac.getPokeInfo(offset),HttpStatus.OK);	
	}
	
	@GetMapping(value = "/pokeById", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Getting general info for a specific pokemon.")
	public ResponseEntity<Object> getPokeById(int id) {
		return new ResponseEntity<>(uac.getPokeInfoById(id),HttpStatus.OK);	
	}
	
	
	
	
}
