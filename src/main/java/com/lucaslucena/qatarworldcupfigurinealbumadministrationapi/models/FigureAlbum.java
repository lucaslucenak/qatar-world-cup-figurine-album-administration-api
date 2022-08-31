package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_figure_album")
public class FigureAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String owner;

//    @ManyToMany
//    @JoinTable(name = "figure_album_has_normal_figure",
//    joinColumns = @JoinColumn(name = "figure_album_id"),
//    inverseJoinColumns = @JoinColumn(name = "normal_figure_id"))
//    private List<NormalFigure> normal_figures;

//    @ManyToMany
//    @JoinTable(name = "figure_album_has_legend_figure",
//            joinColumns = @JoinColumn(name = "figure_album_id"),
//            inverseJoinColumns = @JoinColumn(name = "legend_figure_id"))
//    private List<LegendFigure> legend_figures;
//
//    @ManyToMany
//    @JoinTable(name = "figure_album_has_normal_figure",
//            joinColumns = @JoinColumn(name = "figure_album_id"),
//            inverseJoinColumns = @JoinColumn(name = "normal_figure_id"))
//    private List<RookieFigure> normal_figures;


}

