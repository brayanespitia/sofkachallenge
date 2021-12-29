package DAO;

import entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaDAO extends JpaRepository <PreguntaEntity, Long> {
}
