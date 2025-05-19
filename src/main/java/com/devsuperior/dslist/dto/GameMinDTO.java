package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	// construtor sem argumentos
    public GameMinDTO() {
    }
    
    // construtor com argumentos (source => generate constructors using fields)
    // depois trocar os argumentos pela entidade e Control+Shift+O para importar acima 
    // apagou o this, ex. this.id = entity.getid(), porque não tem ambiguidade no nome do campo

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	// gerar somente getters 
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
    
	
}
