package com.devsuperior.dslist.dto;

public class ReplacementDTO {
	
	private Integer sourceIndex;
	private Integer destinationIndex;
	
    // source - getters and setters 
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
}
