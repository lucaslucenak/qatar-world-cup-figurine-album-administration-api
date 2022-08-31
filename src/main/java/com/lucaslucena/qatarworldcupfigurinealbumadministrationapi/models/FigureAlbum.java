package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_figure_album")
public class FigureAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String owner;

    @ManyToMany
    @JoinTable(name = "figure_album_has_figure",
    joinColumns = @JoinColumn(name = "figure_album_id"),
    inverseJoinColumns = @JoinColumn(name = "figure_id"))
    private List<Figure> figures;

}

