package DAO;


import entity.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorDAO extends JpaRepository <JugadorEntity,Long> {
}
