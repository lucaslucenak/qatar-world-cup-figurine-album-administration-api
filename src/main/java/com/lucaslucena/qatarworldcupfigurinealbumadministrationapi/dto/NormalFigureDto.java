package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigure;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class NormalFigureDto {

    @Column
    private String code;

    @Enumerated(value = EnumType.STRING)
    private FigureType figure_type;

    public NormalFigureDto(NormalFigure normalFigure) {
        this.code = normalFigure.getCode();
    }
}
