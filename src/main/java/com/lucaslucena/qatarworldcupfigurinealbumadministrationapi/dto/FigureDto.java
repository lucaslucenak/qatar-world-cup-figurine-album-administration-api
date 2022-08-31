package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class FigureDto {

    @Column
    private String code;

    @Enumerated(value = EnumType.STRING)
    private FigureType figure_type;
}
