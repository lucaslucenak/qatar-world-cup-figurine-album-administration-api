package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumModel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FigureAlbumDto {

    private Long id;

    private String owner;

    private List<NormalFigureDto> normalFiguresDto = new ArrayList<>();

    public FigureAlbumDto() {
    }

    public FigureAlbumDto(Long id, String owner, List<NormalFigureDto> normalFiguresDto) {
        this.id = id;
        this.owner = owner;
        this.normalFiguresDto = normalFiguresDto;
    }

    public FigureAlbumDto(FigureAlbumModel figureAlbum) {
        this.id = figureAlbum.getId();
        this.owner = figureAlbum.getOwner();
    }

    public FigureAlbumDto(FigureAlbumModel figureAlbum, List<NormalFigureDto> normalFiguresDto) {
        this.id = figureAlbum.getId();
        this.owner = figureAlbum.getOwner();
        this.normalFiguresDto = normalFiguresDto;
    }
}
