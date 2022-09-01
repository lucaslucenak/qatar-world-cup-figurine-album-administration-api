package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.controllers;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.FigureAlbumDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbum;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.services.FigureAlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/figure-album")
public class FigureAlbumController {

    final FigureAlbumService figureAlbumService;

    public FigureAlbumController(FigureAlbumService figureAlbumService) {
        this.figureAlbumService = figureAlbumService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FigureAlbumDto saveFigureAlbum(@RequestBody FigureAlbumDto figureAlbumDto) {
        return figureAlbumService.saveFigureAlbum(figureAlbumDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FigureAlbumDto> findAllFigureAlbums() {
        return figureAlbumService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FigureAlbumDto findFigureAlbumById(@PathVariable("id") Long id) {
        return figureAlbumService.findById(id);
    }

    @GetMapping("/find-by-owner/{owner}")
    @ResponseStatus(HttpStatus.OK)
    public FigureAlbumDto findFigureAlbumByOwner(@PathVariable("owner") String owner) {
        return figureAlbumService.findByOwner(owner);
    }


}
