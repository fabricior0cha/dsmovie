package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private Long movieId;
	
	private String email;
	
	private Double score;

	public ScoreDTO() {
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getValue() {
		return score;
	}

	public void setValue(Double score) {
		this.score = score;
	}
	
	
}
