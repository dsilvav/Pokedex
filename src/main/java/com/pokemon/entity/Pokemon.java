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
public class Pokemon implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int count;
  	private String next;
  	private String previous;
  	private List<Results> results;
  	
  	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<Results> getResults() {
		return results;
	}
	public void setResults(List<Results> results) {
		this.results = results;
	}

}
