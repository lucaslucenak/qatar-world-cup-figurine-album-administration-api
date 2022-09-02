package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_figure")
public class NormalFigureModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;


    public NormalFigureModel(String id) {
        this.id = id;
    }

    public NormalFigureModel() {
    }

    @Id
    @Column(unique = true)
    private String id;

//    @Column(nullable = true)
//    private String country;
//
//    @Column(nullable = true)
//    private String name;

//    @Column
//    @Enumerated(value = EnumType.STRING)
//    private FigureType figure_type;

//    @OneToMany
//    @JoinColumn(name = "figures")
//    private FigureAlbum figure_album;
}
