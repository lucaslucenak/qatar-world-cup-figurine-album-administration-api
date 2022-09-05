package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumHasNormalFigure;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.constraints.FigureAlbumHasNormalFigurePK;

public class FigureAlbumHasNormalFigureDto {

    private FigureAlbumHasNormalFigurePK id = new FigureAlbumHasNormalFigurePK();

    public FigureAlbumHasNormalFigureDto(FigureAlbumHasNormalFigure figureAlbumHasNormalFigure) {
        this.id = figureAlbumHasNormalFigure.getId();
    }

    public FigureAlbumHasNormalFigureDto(FigureAlbumHasNormalFigurePK id) {
        this.id = id;
    }
}
