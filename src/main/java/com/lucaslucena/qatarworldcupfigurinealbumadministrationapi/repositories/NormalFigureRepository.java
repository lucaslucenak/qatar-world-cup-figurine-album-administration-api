package com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.repositories;

import com.lucaslucena.qatarworldcupfigurinealbumadministrationapi.models.NormalFigureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalFigureRepository extends JpaRepository<NormalFigureModel, String> {
}
