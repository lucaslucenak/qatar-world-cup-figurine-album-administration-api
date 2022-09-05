package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.services;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.FigureAlbumHasNormalFigureDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.exceptions.ResourceNotFoundException;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumHasNormalFigure;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories.FigureAlbumHasNormalFigureRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FigureAlbumHasNormalFigureService {

    @Autowired
    private FigureAlbumHasNormalFigureRepository figureAlbumHasNormalFigureRepository;

    public FigureAlbumHasNormalFigureDto save(FigureAlbumHasNormalFigureDto figureAlbumHasNormalFigureDto) {
        FigureAlbumHasNormalFigure figureAlbumHasNormalFigure = new FigureAlbumHasNormalFigure();
        BeanUtils.copyProperties(figureAlbumHasNormalFigureDto, figureAlbumHasNormalFigure);
        figureAlbumHasNormalFigureRepository.save(figureAlbumHasNormalFigure);
        return new FigureAlbumHasNormalFigureDto(figureAlbumHasNormalFigure);
    }

    public List<FigureAlbumHasNormalFigureDto> findAll() {
        List<FigureAlbumHasNormalFigure> figureAlbumHasNormalFigures = figureAlbumHasNormalFigureRepository.findAll();
        return figureAlbumHasNormalFigures.stream().map(x -> new FigureAlbumHasNormalFigureDto(x)).toList();
    }

    public List<FigureAlbumHasNormalFigureDto> findNormalFigureByOwner(String owner) {
        List<FigureAlbumHasNormalFigure> allByOwner = new ArrayList<>();
        for (FigureAlbumHasNormalFigure i : figureAlbumHasNormalFigureRepository.findAll()) {
            if (i.getId().getFigureAlbum().getOwner().equals(owner)) {
                allByOwner.add(i);
            }
        }
        return allByOwner.stream().map(x -> new FigureAlbumHasNormalFigureDto(x)).toList();
    }

    public void deleteById(String owner, String figureId) {
//        List<FigureAlbumHasNormalFigure> figureAlbumHasNormalFigures = figureAlbumHasNormalFigureRepository.findAll();

        List<FigureAlbumHasNormalFigure> allById = new ArrayList<>();
        for (FigureAlbumHasNormalFigure i : figureAlbumHasNormalFigureRepository.findAll()) {
            if(i.getId().getFigureAlbum().getOwner().equals(owner) && i.getId().getNormalFigure().getId().equals(figureId)) {
                allById.add(i);
                break;
            }
        }

        if (allById.size() == 0) {
            throw new ResourceNotFoundException("Id not found. Owner:" + owner + ", Figure Id: " + figureId);
        }
        else {
            figureAlbumHasNormalFigureRepository.deleteById(allById.get(0).getId());
        }
    }
}
