package DAO;


import entity.RespuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaDAO extends JpaRepository <RespuestaEntity, Long> {
}
