package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.FigureAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigureAlbumRepository extends JpaRepository<FigureAlbum, Long> {
}
