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

    @OneToMany(mappedBy = "figure_album")
    private List<Figure> figures;
}

