package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.constraints.FigureAlbumHasNormalFigurePK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tb_figure_album_has_normal_figure")
public class FigureAlbumHasNormalFigure {

    @EmbeddedId
    private FigureAlbumHasNormalFigurePK id = new FigureAlbumHasNormalFigurePK();



    public FigureAlbumHasNormalFigure() {
    }

    public FigureAlbumHasNormalFigure(FigureAlbumHasNormalFigurePK id) {
        this.id = id;
    }
}
