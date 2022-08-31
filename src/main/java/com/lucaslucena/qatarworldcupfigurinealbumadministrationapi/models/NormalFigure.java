package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;

import javax.persistence.*;

@Entity
@Table(name = "tb_figure")
public class NormalFigure {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Id
    @Column(unique = true)
    private String code;

    @Column(nullable = true)
    private String country;

    @Column(nullable = true)
    private String name;
//    @Column
//    @Enumerated(value = EnumType.STRING)
//    private FigureType figure_type;

//    @OneToMany
//    @JoinColumn(name = "figures")
//    private FigureAlbum figure_album;
}
