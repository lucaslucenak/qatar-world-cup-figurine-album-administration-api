package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.entities;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbum;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigure;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Embeddable
public class FigureAlbumHasNormalFigurePK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "figure_album_id")
    private FigureAlbum figureAlbum;

    @ManyToOne
    @JoinColumn(name = "normal_figure_id")
    private NormalFigure normalFigure;

    @Column
    private LocalDateTime local_date = LocalDateTime.now();

    public FigureAlbumHasNormalFigurePK() {
    }

    public FigureAlbumHasNormalFigurePK(FigureAlbum figureAlbum, NormalFigure normalFigure) {
        this.figureAlbum = figureAlbum;
        this.normalFigure = normalFigure;
    }
}
