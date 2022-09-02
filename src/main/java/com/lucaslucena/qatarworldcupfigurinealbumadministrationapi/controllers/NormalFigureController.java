package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.controllers;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.FigureAlbumDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.NormalFigureDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.services.NormalFigureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/normal-figure")
public class NormalFigureController {

    final NormalFigureService normalFigureService;

    public NormalFigureController(NormalFigureService normalFigureService) {
        this.normalFigureService = normalFigureService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NormalFigureDto saveNormalFigure(@RequestBody NormalFigureDto normalFigureDto) {
        return normalFigureService.saveNormalFigure(normalFigureDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<NormalFigureDto> findAllNormalFigures() {
        return normalFigureService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NormalFigureDto findNormalFigureById(@PathVariable("id") String id) {
        return normalFigureService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNormalFigureById(@PathVariable("id") String id) {
        normalFigureService.deleteById(id);
    }
}
