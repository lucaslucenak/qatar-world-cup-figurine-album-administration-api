package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumModel;
import lombok.Getter;
import lombok.Setter;

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

    public FigureAlbumDto(FigureAlbumModel figureAlbum) {
        this.id = figureAlbum.getId();
        this.owner = figureAlbum.getOwner();
    }
}
