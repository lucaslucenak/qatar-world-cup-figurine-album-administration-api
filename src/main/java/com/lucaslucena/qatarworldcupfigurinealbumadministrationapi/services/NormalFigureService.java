package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.services;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.NormalFigureDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.exceptions.DatabaseException;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.exceptions.ResourceNotFoundException;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigureModel;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories.NormalFigureRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NormalFigureService {

    final NormalFigureRepository normalFigureRepository;

    public NormalFigureService(NormalFigureRepository normalFigureRepository) {
        this.normalFigureRepository = normalFigureRepository;
    }

    public NormalFigureDto saveNormalFigure(NormalFigureDto normalFigureDto) {
        NormalFigureModel normalFigureModel = new NormalFigureModel();
        BeanUtils.copyProperties(normalFigureDto, normalFigureModel);
        normalFigureRepository.save(normalFigureModel);
        return new NormalFigureDto(normalFigureModel);
    }

    public NormalFigureDto findById(String id) {
        NormalFigureModel normalFigureModel = normalFigureRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new NormalFigureDto(normalFigureModel);
    }

    public List<NormalFigureDto> findAll() {
        List<NormalFigureModel> normalFigureDtos = normalFigureRepository.findAll();
        return normalFigureDtos.stream().map(x -> new NormalFigureDto(x)).toList();
    }

    public void deleteById(String id) {
        try {
            normalFigureRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Database violation.");
        }
        normalFigureRepository.deleteById(id);
    }
}
