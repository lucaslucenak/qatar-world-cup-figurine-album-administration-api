package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.constraints;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumModel;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigureModel;
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
    private FigureAlbumModel figureAlbum;

    @ManyToOne
    @JoinColumn(name = "normal_figure_id")
    private NormalFigureModel normalFigure;

    @Column
    private LocalDateTime local_date = LocalDateTime.now();

    public FigureAlbumHasNormalFigurePK() {
    }

    public FigureAlbumHasNormalFigurePK(FigureAlbumModel figureAlbum, NormalFigureModel normalFigure) {
        this.figureAlbum = figureAlbum;
        this.normalFigure = normalFigure;
    }
}
