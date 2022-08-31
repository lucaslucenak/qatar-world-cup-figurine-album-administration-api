package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;

import javax.persistence.*;

@Entity
@Table(name = "tb_figure")
public class Figure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private FigureType figure_type;

    @ManyToOne
    @JoinColumn(name = "figures")
    private FigureAlbum figure_album;
}