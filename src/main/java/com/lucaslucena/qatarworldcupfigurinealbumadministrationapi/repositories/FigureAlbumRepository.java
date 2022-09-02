package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.dto.FigureAlbumDto;
import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigureAlbumRepository extends JpaRepository<FigureAlbumModel, Long> {
    public FigureAlbumDto findByOwner(String owner);
}
