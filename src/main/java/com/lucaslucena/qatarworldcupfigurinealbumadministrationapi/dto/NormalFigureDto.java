package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.enums.FigureType;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigureModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class NormalFigureDto {

    @Column
    private String id;

//    @Enumerated(value = EnumType.STRING)
//    private FigureType figure_type;

    public NormalFigureDto(NormalFigureModel normalFigure) {
        this.id = normalFigure.getId();
    }

    public NormalFigureDto() {
    }

    public NormalFigureDto(String id) {
        this.id = id;
    }
}
