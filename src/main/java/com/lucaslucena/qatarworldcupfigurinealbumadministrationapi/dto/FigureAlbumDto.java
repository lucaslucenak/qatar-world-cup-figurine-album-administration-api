package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class FigureAlbumDto {

    private Long id;

    private String owner;

    public FigureAlbumDto() {
    }

    public FigureAlbumDto(Long id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    public FigureAlbumDto(FigureAlbum figureAlbum) {
        this.id = figureAlbum.getId();
        this.owner = figureAlbum.getOwner();
    }
}
