package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.services;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.FigureAlbumDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.exceptions.DatabaseException;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.exceptions.ResourceNotFoundException;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumModel;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories.FigureAlbumRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FigureAlbumService {

    @Autowired
    /*final*/ private FigureAlbumRepository figureAlbumRepository;

//    public FigureAlbumService(FigureAlbumRepository figureAlbumRepository) {
//        this.figureAlbumRepository = figureAlbumRepository;
//    }

    public FigureAlbumDto saveFigureAlbum(FigureAlbumDto figureAlbumDto) {
        FigureAlbumModel figureAlbum = new FigureAlbumModel();
        BeanUtils.copyProperties(figureAlbumDto, figureAlbum);
        figureAlbumRepository.save(figureAlbum);
        return new FigureAlbumDto(figureAlbum);
    }

    public FigureAlbumDto findById(Long id) {
        FigureAlbumModel figureAlbum = figureAlbumRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new FigureAlbumDto(figureAlbum);
    }

    public List<FigureAlbumDto> findAll() {
        List<FigureAlbumModel> figureAlbums = figureAlbumRepository.findAll();
        return figureAlbums.stream().map(x -> new FigureAlbumDto(x)).toList();
    }

    public FigureAlbumDto findByOwner(String owner) {
        FigureAlbumModel figureAlbum = new FigureAlbumModel();
        for (FigureAlbumModel i : figureAlbumRepository.findAll()) {
            if (i.getOwner().equals(owner)) {
                figureAlbum = i;
            }
        }

        return new FigureAlbumDto(figureAlbum);
    }

    public void deleteById(Long id) {
        try {
            figureAlbumRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Database violation.");
        }
    }
}
