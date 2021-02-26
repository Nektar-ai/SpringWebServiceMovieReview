package fr.epsi.moviereview2.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.epsi.moviereview2.apifetch.Results;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieRestTemplate {

	private String page;
	  private Results results;
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Results getResults() {
		return results;
	}
	public void setResults(Results results) {
		this.results = results;
	}

	@Override
	public String toString() {
		
		return "Quote{" +
				"type='" + page + '\'' +
				", value=" + results +
				'}';
	  }	
}
